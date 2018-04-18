//package com.lychr.utils;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.LineNumberReader;
//
//public class IPUtil {
//    public static String getRemoteAddress(HttpServletRequest request) {
//        String ip = request.getHeader("x-forwarded-for");
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("HTTP_CLIENT_IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//        return ip;
//    }
//
//
//    public static String getMACAddress(String ip){
//        String str = "";
//        String macAddress = "";
//        try {
//            Process p = Runtime.getRuntime().exec("nbtstat -A " + ip);
//            InputStreamReader ir = new InputStreamReader(p.getInputStream());
//            LineNumberReader input = new LineNumberReader(ir);
//            for (int i = 1; i < 100; i++) {
//                str = input.readLine();
//                if (str != null) {
//                    if (str.indexOf("MAC Address") > 1) {
//                        macAddress = str.substring(
//                                str.indexOf("MAC Address") + 14, str.length());
//                        break;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace(System.out);
//        }
//        return macAddress;
//    }
//
//}
