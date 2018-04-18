
package com.lychr.user.mybatis;

import com.github.pagehelper.PageHelper;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author weiyong
 * @Description: 概述本类
 * @date 2017年11月21日
 */
@Configuration
@MapperScan("com.lychr.user.dao")
@EnableTransactionManagement
public class MybatisApplication {

    @Bean
    public DataSource dataSource() throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setUsername("root");
        config.setPassword("youpassword");
        config.setJdbcUrl("jdbc:mysql://123.206.131.80:3306/shop?useSSL=false");
        config.setDriverClassName("com.mysql.jdbc.Driver");
        return new HikariDataSource(config);
    }

    @Bean
    public Resource[] mapperLocations() throws IOException {
        return new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*Mapper.xml");
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        // 分页插件
        PageHelper pageHelper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("supportMethodsArguments", "true");
        props.setProperty("returnPageInfo", "check");
        props.setProperty("params", "count=countSql");
        props.setProperty("dialect", "mysql");

        pageHelper.setProperties(props);
        // 添加插件
        sqlSessionFactoryBean.setPlugins(new Interceptor[] { pageHelper });
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setMapperLocations(mapperLocations());
        return sqlSessionFactoryBean.getObject();
    }
}
