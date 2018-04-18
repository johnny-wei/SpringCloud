//package com.lychr.user.mybatis;
//
//import com.lychr.market.redis.JedisUtil;
//import com.lychr.market.utils.SerializeUtil;
//import org.apache.ibatis.cache.Cache;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import redis.clients.jedis.Jedis;
//
//import java.util.concurrent.locks.ReadWriteLock;
//import java.util.concurrent.locks.ReentrantReadWriteLock;
//
///**
// * @Atuthor:weiyong
// * @Description:redis实现mybatis的二级缓存
// * @Date:2017/12/7
// */
//
//public class MybatisCache implements Cache {
//    private static Logger logger = LoggerFactory.getLogger(MybatisCache.class);
//    private String id;
//    private int defaultimeout = 5 * 60;
//    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
//
//    public MybatisCache(final String id) {
//        if (logger.isInfoEnabled()) {
//            logger.info("MybatisRedisCache id {}", id);
//        }
//        if (id == null) {
//            throw new IllegalArgumentException("Cache instances require an ID");
//        }
//        this.id = id;
//    }
//
//    @Override
//    public String getId() {
//        return this.id;
//    }
//
//    @Override
//    public int getSize() {
//        Jedis jedis = null;
//        int size = -1;
//        try {
//            jedis = JedisUtil.getJedisUtil().getJedis();
//            size = Integer.valueOf(jedis.dbSize().toString());
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
//        return size;
//    }
//
//    @Override
//    public void putObject(Object key, Object value) {
//        if (logger.isInfoEnabled()) {
//            logger.info("putObject key: {}", key);
//        }
//        Jedis jedis = null;
//        try {
//            jedis = JedisUtil.getJedisUtil().getJedis();
//            byte[] byteKey = SerializeUtil.serialize(key);
//            byte[] byteValue = SerializeUtil.serialize(value);
//            jedis.setex(byteKey, defaultimeout, byteValue);
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
//    }
//
//    @Override
//    public Object getObject(Object key) {
//        if (logger.isInfoEnabled()) {
//            logger.info("getObject key: {}", key);
//        }
//        Object object = null;
//        Jedis jedis = null;
//        try {
//            jedis = JedisUtil.getJedisUtil().getJedis();
//            byte[] bytes = jedis.get(SerializeUtil.serialize(key));
//            if (bytes != null) {
//                object = SerializeUtil.unserialize(bytes);
//            }
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
//        return object;
//    }
//
//    @Override
//    public Object removeObject(Object key) {
//        if (logger.isInfoEnabled()) {
//            logger.info("removeObject key: {}", key);
//        }
//        String result = "success";
//        Jedis jedis = null;
//        try {
//            jedis = JedisUtil.getJedisUtil().getJedis();
//            jedis.del(String.valueOf(key));
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
//        return result;
//    }
//
//    @Override
//    public void clear() {
//        if (logger.isInfoEnabled()) {
//            logger.info("start clear cache");
//        }
//        String result = "fail";
//        Jedis jedis = null;
//        try {
//            jedis = JedisUtil.getJedisUtil().getJedis();
//            result = jedis.flushAll();
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        }
//        if (logger.isInfoEnabled()) {
//            logger.info("end clear cache result is {}", result);
//        }
//    }
//
//    @Override
//    public ReadWriteLock getReadWriteLock() {
//        return readWriteLock;
//    }
//}
