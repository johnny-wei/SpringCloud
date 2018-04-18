//package com.lychr.utils;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.lychr.market.config.ConfigKey;
//import com.lychr.market.config.ConfigKit;
//import com.qcloud.cos.COSClient;
//import com.qcloud.cos.ClientConfig;
//import com.qcloud.cos.meta.InsertOnly;
//import com.qcloud.cos.request.UploadFileRequest;
//import com.qcloud.cos.sign.Credentials;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.*;
//
///**
// * @Author:weiyong
// * @Description:文件工具类
// * @Date:2017/11/28
// */
//@Component
//public class FileUtil {
//    private Logger LOG = LoggerFactory.getLogger(FileUtil.class);
//    private COSClient cosClient = null;
//    private ConfigKit configKit;
//
//    public COSClient getCOSClient() {
//        if (cosClient != null) {
//            return cosClient;
//        }
//        Credentials cred = new Credentials(Integer.valueOf(configKit.getConfigContent(ConfigKey.COS_APPID)), configKit.getConfigContent(ConfigKey.COS_SECRETID), configKit.getConfigContent(ConfigKey.COS_SECRETKEY));
//        ClientConfig clientConfig = new ClientConfig();
//        clientConfig.setRegion(configKit.getConfigContent(ConfigKey.COS_REGION));
//        cosClient = new COSClient(clientConfig, cred);
//        return cosClient;
//    }
//
//    public FileUtil(ConfigKit configKit) {
//        this.configKit = configKit;
//        this.cosClient = getCOSClient();
//    }
//
//    //type 1 认证图片   2 头像
//    public String uploadAuthImageToCOS(MultipartFile file, String filename, int type) {
//        try {
//            String filesuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
//            String cospath = "";
//            if (filesuffix.trim().equals("")) {
//                filesuffix = "png";
//            }
//            if (type == 1) {
//                cospath = "authimage";
//            } else if (type == 2) {
//                cospath = "headpic";
//            } else if (type == 3) {
//                cospath = "wechatqr";
//            } else {
//                cospath = "other";
//            }
//            UploadFileRequest uploadFileRequest = new UploadFileRequest(configKit.getConfigContent(ConfigKey.COS_BUCKETNAME),
//                    "/" + cospath + "/" + filename + "." + filesuffix, getMultipartFileByte(file));
//            uploadFileRequest.setInsertOnly(InsertOnly.OVER_WRITE);//允许覆盖
//            String uploadFileRet = cosClient.uploadFile(uploadFileRequest);
//            JSONObject jb = JSON.parseObject(uploadFileRet);
//            if (jb.getString("code").equals("0")) {
//                //上传成功 返回访问地址
//                return jb.getJSONObject("data").getString("source_url");
//            }
//            LOG.error("验证图片文件上传失败");
//            return null;
//        } catch (Exception e) {
//            LOG.info("图片上传异常");
//            return null;
//        }
//    }
//    //上传文件到cos
//
//    //获取文件字节数组
//    public byte[] getMultipartFileByte(MultipartFile file) throws Exception {
//        long fileSize = file.getSize();
//        if (fileSize > Integer.MAX_VALUE) {
//            System.out.println("file too big...");
//            return null;
//        }
//        InputStream fi = file.getInputStream();
//        byte[] buffer = new byte[(int) fileSize];
//        int offset = 0;
//        int numRead = 0;
//        while (offset < buffer.length
//                && (numRead = fi.read(buffer, offset, buffer.length - offset)) >= 0) {
//            offset += numRead;
//        }
//        // 确保所有数据均被读取
//        if (offset != buffer.length) {
//            throw new IOException("Could not completely read file "
//                    + file.getName());
//        }
//        fi.close();
//        return buffer;
//    }
//
//    //上传保存文件
//    public String saveFileToPath(MultipartFile f, File destinationpath, String name) throws Exception {
//        //后缀
//        if (!destinationpath.exists()) {
//            destinationpath.mkdirs();
//        }
//        String filesuffix = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf(".") + 1);
//        File resultfile = new File(destinationpath + "//" + name + "." + filesuffix);
//        if (resultfile.exists()) {
//            resultfile.delete();
//        }
//        resultfile.createNewFile();
//        FileOutputStream fos = new FileOutputStream(resultfile);
//        InputStream fis = f.getInputStream();
//        try {
//            int i;
//            byte[] bytes = new byte[64];
//            while ((i = fis.read(bytes)) != -1) {
//                fos.write(bytes);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            fos.close();
//            fis.close();
//        }
//        return resultfile.getAbsolutePath();
//    }
//
//
//}
