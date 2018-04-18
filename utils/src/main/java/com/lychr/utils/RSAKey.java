package com.lychr.utils;

/**
 * @Author:weiyong
 * @Description:常用公私钥
 * @Date:2017/11/28
 */
public interface RSAKey {
    //登陆公私钥
    public static String LOGIN_PUBLICKEY="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDTeM13DJ/Njmxfj5K6eO6kY1Qv\n" +
            "/CI7OA5W6Y5mURUmLxWKW8aPhtzXxALwDmdDI+5P3a5C9XiZY2oK7188JO50lcLN\n" +
            "SHrG43UFq2CaHX82fQURgtv5+s7iZBoCkm7+RPka8WTVAlpCzfIqvccDqYbNK3Uj\n" +
            "G+9TDLYSU5H+NIFTMQIDAQAB";
    public static String LOGIN_PRIVATEKEY="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBANN4zXcMn82ObF+P\n" +
            "krp47qRjVC/8Ijs4DlbpjmZRFSYvFYpbxo+G3NfEAvAOZ0Mj7k/drkL1eJljagrv\n" +
            "Xzwk7nSVws1IesbjdQWrYJodfzZ9BRGC2/n6zuJkGgKSbv5E+RrxZNUCWkLN8iq9\n" +
            "xwOphs0rdSMb71MMthJTkf40gVMxAgMBAAECgYAyX3U55XTvZvyjqrR93K6j09FK\n" +
            "+NlCl/C6fTnhX3EVPmP4KDJdH/fdIaC9hADO+nEa7yhCZOyMRSUOY8Sgs/9ksR2d\n" +
            "Kooa7DPMzYKiAVLN5ErgaKB8eTNopZqSJlAJTsLyHrJAgcrqHcaAv8WYsCQ3PQ4f\n" +
            "co00qcuUJdQRu1X5UQJBAO/db7rsAkZ05bibR4Lc8z2/sPk/6ZfIgmL4T8enf8k9\n" +
            "c8r27r9ysI9DyPr77roQNgIfRNcgyPWi06gV426iZsUCQQDhsm0tq4pHMM/7s3CM\n" +
            "fCHXZ82ICX2oDIbrFpWJ610/GldHJ61Ko0nh64YlJaC436JfrL2CcFNNVaCtnPEl\n" +
            "euF9AkEAzBLr0m6laOhf4fZKmy38zRZgLU+RIA/5ztZQmh8J+18LOy1n5v5e9STI\n" +
            "w7DAZRERwjB0U0uTbllAFou42hHVuQI/DTlnLEXg1EsH5Lee4JxlXzm10UK9Ghuh\n" +
            "zCSGno4r6Iailoi8nqLysUobkhGiWTLBUNnOQNZUCzP5NjL77jZFAkEAiG2h6UX3\n" +
            "UZSKxm12HCFNoh0SoSH7qUscSnUDMVgAGvnv7Ro83WkQtQVBGEoZPw9uidK2+jaQ\n" +
            "pSUkdgXXYz6Fug==";

    public static void main(String[] args) throws  Exception{
     //  System.out.print(LOGIN_PRIVATEKEY);
//       String ioscontent="uV100IgluDWBr5NG9+J8I6283WRc+IlJoK6NTvaeopQ6iACce517nAr3fbGjj9K4IH2jy/Gr4ZaEeLBm/oZmynjJhfLXt/0hqgS97khWjZ18rIggSHJxfcUuO4y6/hNnIE7eKXBkVlFoAPVlx2U2t1EG9E3GJvUMRznPSrhD8c8=";
//        String androidcontent="S6Y2C0LhyPYTf1X/24lsKRGEJ5lTVRxEwOKXxgrWp3SjmdWUk+ZL9bWcvIIUdphTfax3REK2YU/r\n" +
//                "ZEbWK/Kzk+LZMztIhPLMU3D7qOH2YA0y+TASCub/kbDU5exjAfkBOUPY6elxWkejLIFxY1j3dYUF\n" +
//                "Gs8D7ehuo48WJFRy8kQ=";
//        //S//tring oridata="13120951687";


        String password="carryme";
        byte[] resut= RSAUtil.encryptByPublicKeyForSpilt(password.getBytes(),Base64Util.decode(LOGIN_PUBLICKEY));

        System.out.println(Base64Util.encode(resut));
       //String oricontent="iamweiyong";
  // byte[] resut= RSAUtil2.encryptByPublicKey(oricontent.getBytes(),Base64Util.decode(LOGIN_PUBLICKEY));
      //System.out.println("加密结果"+Base64Util.encode(resut));

      // byte[] result1= RSAUtil2.encryptByPublicKey(content.getBytes(),Base64Util.decode(LOGIN_PRIVATEKEY));

        //System.out.println("加密结果"+new String(result1));
       //byte[] jiamijieguo= RSAUtil.encryptByPublicKey(oridata.getBytes(),Base64Util.decode(LOGIN_PUBLICKEY));
       // byte[] encryptBytes   = RSAUtil.decryptByPrivateKeyForSpilt( Base64Util.decode(androidcontent), Base64Util.decode(LOGIN_PRIVATEKEY));
//                    String encry_phone = Base64.encodeToString(encryptBytes, Base64.DEFAULT);
//                    byte[] fin = Base64.decode(encry_phone.getBytes(),Base64.DEFAULT);

     //  Log.bankicon(TAG, new String(encryptBytes));
       //byte[] result2  = RSAUtil2.decryptByPrivateKey(Base64Util.decode(content),Base64Util.decode(LOGIN_PRIVATEKEY));
        //System.out.println("解密结果"+new String(encryptBytes));
        //System.out.print(new String(Base64Util.encode(jiamijieguo)) )
       // ;
    }
}
