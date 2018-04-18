package com.lychr.utils;

import java.security.MessageDigest;

public class SHAUtils {
  public static final String KEY_SHA = "SHA-256";
  private static SHAUtils me = null;

  public static SHAUtils getMe() {
    if (me == null) {
      me = new SHAUtils();
    }
    return me;
  }

  /**
   * SHA加密
   * 
   * @param coder
   * @return
   * @throws Exception
   */
  public String encoderSHA(String coder) {
    StringBuilder output = new StringBuilder(32);
    MessageDigest md = null;
    try {
      md = MessageDigest.getInstance(KEY_SHA);
      md.update(coder.getBytes("UTF-8"));
      byte[] b = md.digest();
      for (int i = 0; i < b.length; i++) {
        String temp = Integer.toHexString(b[i] & 0xff);
        if (temp.length() < 2) {
          output.append("0");
        }
        output.append(temp);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return output.toString();
  }
}