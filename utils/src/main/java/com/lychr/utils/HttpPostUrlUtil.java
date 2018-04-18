package com.lychr.utils;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HttpPostUrlUtil {
	
	/**
	 * 向指定URL发送POST请求
	 * @param url
	 * @param paramMap
	 * @return 响应结果
	 */
	public static String sendPost(String url, Map<String, String> paramMap) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "multipart/form-data");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("sessionid", "9177c16d-343e-4f9d-a953-83e465bfac88");
			conn.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// conn.setRequestProperty("Charset", "UTF-8");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());

			// 设置请求属性
			String param = "";
			if (paramMap != null && paramMap.size() > 0) {
				Iterator<String> ite = paramMap.keySet().iterator();
				while (ite.hasNext()) {
					String key = ite.next();// key
					String value = paramMap.get(key);
					param += key + "=" + value + "&";
				}
				param = param.substring(0, param.length() - 1);
			}

			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			System.err.println("发送 POST 请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
    /**
     * 数据流post请求
     * @param urlStr
     * @param xmlInfo
     */
	public static String doPost(String urlStr, String strInfo) {
		String reStr="";
		try {
			URL url = new URL(urlStr);
			URLConnection con = url.openConnection();
			con.setDoOutput(true);
			con.setRequestProperty("Pragma:", "no-cache");
			con.setRequestProperty("Cache-Control", "no-cache");
			con.setRequestProperty("Content-Type", "text/xml");
			OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
			out.write(new String(strInfo.getBytes("utf-8")));
			out.flush();
			out.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			String line = "";
			for (line = br.readLine(); line != null; line = br.readLine()) {
				reStr += line;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reStr;
	}
	
	public static void main(String[] args) throws  Exception{
		Map<String, String> map = new HashMap<String, String>();
		/*String extOrderId = "2016122705420900001133";
		String orderId = "677451227657";
		String userId = "53627";
		String timestamp = System.currentTimeMillis() + "";
		String key = "564344e7c41ca3d268340888728911d8464347a687225e2b";*/
		String pwd="nGiy7tAv0lJezZmORjA9U3R20vCmH3BxgCfhqNLtsno9tSqJyArp1LC+7H4hpHt3Qu7vATF4TnpeAjvoKYAZAyyVhNM1WhNGoT7fJbnzvZhBsBTbDMSKSskyY+mfFWqRsQ5cDRg2efydX/O7eHp0YlzMVOEtqdtzefZ1s4AtNZM=";
		String mob="i3u5CPo2rwuo1cGEWh9xZr8y6LYYWd833uL80OMtJfCn5Qo3Up3f6PAJMkWxMoDtA1DHYK8ldSjXNv68pbx062FiQOy64MTpadL3UbzJUjp1ALvc6xSeeKxDjC2oX5Pjh99UKYzNKeWNF4gXq8T5fQCIMxo/SBNsAcR0cL7/zqA=";

		/*map.put("orderId", orderId);
		map.put("extOrderId", extOrderId);
		map.put("userId", userId);
		map.put("timestamp", timestamp);*/
		map.put("password", URLEncoder.encode(pwd,"utf-8"));
		map.put("mobile", URLEncoder.encode(mob,"utf-8"));
		String pathUrl = "http://123.206.131.80:8081/market/login/loginwithpassword";
		String pathUrl2 = "http://123.206.131.80:8081/market/user/test";

		//OkHttpClient client=new OkHttpClient();
	//RequestBody formbody=new ok
	String result = sendPost(pathUrl2, null);
		System.out.println(result);
	}
	


}
