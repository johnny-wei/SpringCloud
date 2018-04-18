package com.lychr.utils;


import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 字符串日期工具类
 */
public class StringUtil {

	/**
	 * 当前时间转换yyyyMMddHHmmss格式
	 * 
	 * @return
	 */
	public static String getCurrentDateStr() {
		Date date = new Date();
		String str = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		str = df.format(date);
		return str;
	}

	/**
	 * 根据输入的格式转化当前日期格式
	 * @param pattern
	 * @return
	 */
	public static String getCurrentDataStr(String pattern){
		Date date = new Date();
		String str = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		str = sdf.format(date);
		return str;
	}
	
	/**
	 * 获取前七天的日期(月-日)
	 * @return
	 */
	public static String[] getRecentSevenDays(){
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		Calendar calendar = Calendar.getInstance();
		String[] days = new String[7];
		for (int i = 0; i < 7; i++) {
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			Date date = calendar.getTime();
			days[i] = sdf.format(date);
		}
	    return days;
	}
	
	/**
	 * 获取前七天的日期(年月日)
	 * @return
	 */
	public static String[] getRecentSevenDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		String[] days = new String[7];
		for (int i = 0; i < 7; i++) {
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			Date date = calendar.getTime();
			days[i] = sdf.format(date);
		}
	    return days;
	}
	


	/**
	 * 字符串转日期格式
	 * @param str
	 * @return
	 */
	public static Date StringToDate(String str, String pattern){
		if (str == null || str.length() == 0 || 
				pattern == null || pattern.length() == 0) 
			return null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 将字节数组转为16进制
	 * 
	 * @param src
	 *            数组
	 * @return 16进制字符串
	 */
	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder("");
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString().toUpperCase();
	}

	/**
	 * 16进制转字节数组
	 * 
	 * @param hexString
	 *            16进制字符串
	 * @return 数组
	 */
	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		return d;
	}

	private static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}


	/**
	 * 将大写加下划线的字符串转换为camel大小写形式的字符串 sample: HELLO_WORLD --> helloWorld
	 * 
	 * @param upperCaseString
	 *            大写带下划线的字符串
	 * @return camelStyle格式的字符串
	 */
	public static String convertUpperCaseToCamelStyle(String upperCaseString) {
		return parseMethodType(upperCaseString);
	}

	public static String transformCode(String str) {
		try {
			transformCodeTest(str);
			return new String(str.getBytes("GBK"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	private static void transformCodeTest(String str) throws UnsupportedEncodingException {
		String[] code = { "GBK", "UTF-8", "ISO8859-1", "gb2312" };
		for (int i = 0; i < code.length; i++) {
			System.out.println(code[i] + " : " + new String(str.getBytes(code[i])));
			for (int j = 0; j < code.length; j++) {
				if (i != j)
					System.out.println(code[j] + " -> " + code[i] + " : " + new String(str.getBytes(code[j]), code[i]));
			}
		}
	}

	public static String parseLowercase(String str, String space) {
		ArrayList<String> strs = StringUtil.splitString(str);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.size(); i++) {
			str = (String) strs.get(i);
			sb.append(str.toLowerCase());
			if (i < strs.size() - 1)
				sb.append(space);
		}
		return sb.toString();
	}

	public static String parseUppercase(String str, String space) {
		ArrayList<String> strs = StringUtil.splitString(str);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.size(); i++) {
			str = (String) strs.get(i);
			sb.append(str.toUpperCase());
			if (i < strs.size() - 1)
				sb.append(space);
		}
		return sb.toString();
	}

	public static String parseMethodType(String str) {
		ArrayList<String> strs = StringUtil.splitString(str);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.size(); i++) {
			str = (String) strs.get(i);
			if (i > 0)
				sb.append(str.substring(0, 1).toUpperCase());
			else
				sb.append(str.substring(0, 1).toLowerCase());
			sb.append(str.substring(1, str.length()).toLowerCase());
		}
		return sb.toString();
	}

	public static String parseClassType(String str) {
		ArrayList<String> strs = StringUtil.splitString(str);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.size(); i++) {
			str = (String) strs.get(i);
			sb.append(str.substring(0, 1).toUpperCase());
			sb.append(str.substring(1, str.length()).toLowerCase());
		}
		return sb.toString();
	}

	public static String wipeUnderline(String str) {
		while (str.indexOf("_", 0) == 0) {
			;
		}
		return str;
	}

	/**
	 * 将字符串拆分为单词列表
	 * 
	 * @param str
	 *            字符串
	 * @return 单词列表
	 */
	private static ArrayList<String> splitString(String str) {
		ArrayList<String> strArray = new ArrayList<String>();
		strArray.add(str);
		strArray = StringUtil.splitStrWithStr(strArray, "_");
		strArray = StringUtil.splitStrWithStr(strArray, " ");
		return strArray;
	}

	/**
	 * 将字符串组中每个字符串以split拆分，然后再组成字符串组
	 * 
	 * @param in
	 *            包含字符串的列表
	 * @param split
	 *            拆分标志
	 * @return 包含拆分后数组的列表
	 */
	private static ArrayList<String> splitStrWithStr(ArrayList<String> in, String split) {
		ArrayList<String> out = new ArrayList<String>();
		for (int i = 0; i < in.size(); i++) {
			String tempStr = (String) in.get(i);
			String[] strs = tempStr.split(split);
			for (int j = 0; j < strs.length; j++) {
				out.add(strs[j]);
			}
		}
		return out;
	}


	/**
	 * 用字府c给字符串str补足位数 123，c=0，digitNum=2，则返回00123
	 * 
	 * @param str
	 *            待处理的字符串
	 * @param c
	 *            要补位的字符
	 * @param digitNum
	 *            要补的位数
	 * @return 不足位数之后的字符串
	 */
	public static String getFullChar(String str, char c, int digitNum) {
		if (str != null) {
			for (int i = str.length(); i < digitNum; i++) {
				str = c + str;
			}
		}
		return str;
	}

	/**
	 * 得到字符串中第一个不是c字符的后面的字符串
	 * 
	 * @param str
	 *            待处理的字符串
	 * @param c
	 *            字符
	 * @return 字符串中第一个不是c字符的后面的字符串
	 */
	public static long getNumberFromString(String str, char c) {
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				if (c != str.charAt(i)) {
					return Long.parseLong(str.substring(i, str.length()));
				}
			}
		}
		return 0;
	}


	/**
	 * 将第一位是"."的数字前自动补0 比如.1==>0.1，.120==>0.120
	 * 
	 * @param str
	 *            数字
	 * @return 补0后的数字
	 */
	public static String formatZeroNumber(String str) {
		if (str != null) {
			if (".".equals(str.substring(0, 1))) {
				str = "0" + str;
			}
		}
		return str;
	}

	/**
	 * 将大数字转换为科学计数法表现的形式 如12345表示为1.2345000E4 1000000表示为1.0000000E6
	 * 
	 * @param bd
	 *            大数字
	 * @return 科学计数法表现的大数字
	 */
	public static String convertBigDecimalToStringWithE(BigDecimal bd) {
		int exponent = 0;
		BigDecimal newBigDecimal = null;
		if (bd == null)
			return "";
		if (bd.compareTo(new BigDecimal("0")) == 0) {
			return "0";
		}
		if (bd.abs().compareTo(new BigDecimal(10)) < 0 && bd.abs().compareTo(new BigDecimal(1)) >= 0) {
			newBigDecimal = bd;
			exponent = 0;
		} else if (bd.abs().compareTo(new BigDecimal(10)) >= 0) {
			do {
				newBigDecimal = bd.divide(new BigDecimal(10), 7, 6);
				exponent++;
				bd = newBigDecimal;
			} while (newBigDecimal.abs().compareTo(new BigDecimal(10)) >= 0);

		} else if (bd.abs().compareTo(new BigDecimal(1)) < 0) {
			do {
				newBigDecimal = bd.multiply(new BigDecimal(10));
				exponent--;
				bd = newBigDecimal;
			} while (newBigDecimal.abs().compareTo(new BigDecimal(1)) < 0);

		}

		DecimalFormat df = new DecimalFormat("#.0000000");

		return df.format(newBigDecimal) + "E" + exponent;
	}


	/**
	 * 计算百分比
	 * 
	 * @param totalCount
	 *            总数
	 * @param count
	 *            个体数
	 * @return 百分比
	 */
	public static String getPercentString(String totalCount, String count) {
		BigDecimal c = new BigDecimal(count);
		BigDecimal total = new BigDecimal(totalCount);
		double percent = c.divide(total, 5, BigDecimal.ROUND_HALF_UP).doubleValue();
		BigDecimal percentValue = new BigDecimal(Double.toString(percent));
		BigDecimal value = new BigDecimal("100");
		String percentString = String.valueOf(percentValue.multiply(value).toString()) + "%";
		return percentString;
	}

	/**
	 * 15位身份证号码转换成18位算法
	 * 
	 * @param s
	 *            15位身份证号码
	 * @return 18位身份证号码
	 */
	public static String generate18BitFrom15Bit(String s) {
		final int vList[] = { 7, 9, 10, 5, 8, 4, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		int intN = 0;
		int r = 0;
		String t = "";
		// int[] n = new int[15];
		String s1 = s.substring(0, 6);
		String s2 = s.substring(6, 15);
		for (int i = 14; i >= 0; i--) {
			intN += Integer.parseInt(s.substring(i, i + 1)) * vList[i];
		} // 15位号码的 加权*号码
		intN += 2 * 1 + 1 * 9;// 添加1,9位的加权*号码
		r = intN % 11;// 获取mod值
		switch (r) {
		case 0:
			t = "1";
			break;
		case 1:
			t = "0";
			break;
		case 2:
			t = "X";
			break;
		case 3:
			t = "9";
			break;
		case 4:
			t = "8";
			break;
		case 5:
			t = "7";
			break;
		case 6:
			t = "6";
			break;
		case 7:
			t = "5";
			break;
		case 8:
			t = "4";
			break;
		case 9:
			t = "3";
			break;
		case 10:
			t = "2";
			break;
		default:
		}
		return s1 + "19" + s2 + t;
	}

	/**
	 * 将文件名中的汉字转为UTF8编码的串,以便下载时能正确显示另存的文件名. xiadi
	 * 
	 * @param s
	 *            原文件名
	 * @return 重新编码后的文件名
	 */
	public static String toUtf8String(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 0 && c <= 255) {
				sb.append(c);
			} else {
				byte[] b;
				try {
					b = Character.toString(c).getBytes("utf-8");
				} catch (Exception ex) {
					System.out.println(ex);
					b = new byte[0];
				}
				for (int j = 0; j < b.length; j++) {
					int k = b[j];
					if (k < 0)
						k += 256;
					sb.append("%" + Integer.toHexString(k).toUpperCase());
				}
			}
		}
		return sb.toString();
	}

	public static String getDaoMainSimpleName(String name) {
		return name.substring(name.lastIndexOf(".") + 1);
	}

	public static String produceRandomNum(int len) {
		String str = "0123456789";
		Random rd = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			sb.append(str.charAt(rd.nextInt(10)));
		}

		return sb.toString();
	};


	public static String formatByPhone(String phoneName) {
        	return phoneName.substring(0, 3) + "****" + phoneName.substring(7, phoneName.length());
	}

	public static String formatByTelphone(String telphoneName) {
		int index = telphoneName.indexOf("-");
		return telphoneName.substring(0, index + 3) + "****" + telphoneName.substring(index + 7, telphoneName.length());

	}

	public static String[] splitTelphone(String telphoneName) {
		String areaCode = telphoneName.substring(0, telphoneName.indexOf("-"));
		telphoneName = telphoneName.substring(areaCode.length() + 1, telphoneName.length());
		return new String[] { areaCode, telphoneName };
	}

	public static String replaceBlank(String str) {
		String dest = "";
		if (str != null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}

	public static boolean regexp(String regexp, String str) {
		return Pattern.compile(regexp).matcher(str).matches();
	}

	public static String formatByID(String idNumber) {
		if (null != idNumber && !"".equals(idNumber) && idNumber.length() >= 15) {
			idNumber = idNumber.substring(0, 3) + "***********"
					+ idNumber.substring(idNumber.length() - 4, idNumber.length());
		}
		return idNumber;
	}
	/**
	 * 将金额从元转为分
	 * 
	 * @param amtY
	 *            String
	 * @return
	 */
	public static String formatAmtY2F(String amtY) {
		if (amtY == null || "".equals(amtY.trim()))
			return "0";
		int index = amtY.indexOf(".");
		int len = amtY.length();
		StringBuffer amtF = new StringBuffer();
		if (index == -1) {
			amtF.append(amtY).append("00");
		} else if ((len - index) == 1) {
			amtF.append(Long.parseLong(amtY.replace(".", ""))).append("00");
		} else if ((len - index) == 2) {
			amtF.append(Long.parseLong(amtY.replace(".", ""))).append("0");
		} else if ((len - index) == 4){
			amtF.append(new BigDecimal(amtY).multiply(new BigDecimal("100")).doubleValue());
		} else {
			amtF.append(Long.parseLong(amtY.replace(".", "")));
		}
		return amtF.toString();
	}

	/**
	 * 将金额从分转为元,
	 * 
	 * @param amtF
	 *            String
	 * @return xx.xx
	 */
	public static String formatAmtF2Y(String amtF) {
		if (amtF == null || "".equals(amtF = amtF.trim())
				|| "null".equals(amtF)) {
			return "0.00";
		}
		// true:负数;false:正数
		boolean flag = false;
		if ('-' == amtF.charAt(0)) {
			flag = true;
			amtF = amtF.substring(1);
		}
		StringBuffer amtY = new StringBuffer();
		if (amtF.length() == 1) {
			amtY.append("0.0").append(amtF);
		} else if (amtF.length() == 2) {
			amtY.append("0.").append(amtF);
		} else {
			if(amtF.substring(2, 3).equals(".")){
				amtY = amtY.append("0.").append(amtF.replace(".", "").substring(0, 2));
			}else{
				if (amtF.indexOf(".") > 0) {
					amtF = amtF.split("\\.")[0];
				}
				amtY.append(amtF.substring(0, amtF.length() - 2)).append(".")
						.append(amtF.substring(amtF.length() - 2));
			}
			
		}
		String result = amtY.toString();
		return flag ? "-" + result : result;
	}
	/**
	 * 格式化卡号
	 * @param bankCardNo
	 * @return
	 */
	public static String formatBankCardNo(String bankCardNo) {
		StringBuilder sb = new StringBuilder();
		if (bankCardNo.length() >= 4) {
			return sb.append(bankCardNo.substring(0, 3)).append("********")
					.append(bankCardNo.substring(bankCardNo.length() - 4)).toString();
		} else {
			return bankCardNo;
		}

	}
	public static String formatBankCardNo4(String bankCardNo) {
		StringBuilder sb = new StringBuilder();
		if (bankCardNo.length() >= 4) {
			return sb.append("[*")
					.append(bankCardNo.substring(bankCardNo.length() - 4)).append("]").toString();
		} else {
			return bankCardNo;
		}

	}
	
	public static final String fillBeforeZero(String src, int length) {
		StringBuilder sb = new StringBuilder();
		if (src == null || "".equals(src.trim())) {
			for (int i = 0; i < length; i++) {
				sb.append("0");
			}
			return sb.toString();
		}
		if (src.length() > length) {
			return src;
		}

		for (int i = 0; i < length - src.length(); i++) {
			sb.append("0");
		}
		return sb.append(src).toString();
	}
	public static long generateRandomNumber(int n){
		if(n<1){
			throw new IllegalArgumentException("随机数位数必须大于0");
		}
		return (long)(Math.random()*9*Math.pow(10,n-1)) + (long)Math.pow(10,n-1);
	}
	public static boolean checkString(String content){
		if(content==null||"".equals(content)){
			return false;
		}else{
			return true;
		}
	}
	//生成邀请码
	public static String getCharAndNumr(int length)
	{
		String val = "";

		Random random = new Random();
		for(int i = 0; i < length; i++)
		{
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字

			if("char".equalsIgnoreCase(charOrNum)) // 字符串
			{
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; //取得大写字母还是小写字母
				val += (char) (choice + random.nextInt(26));
			}
			else if("num".equalsIgnoreCase(charOrNum)) // 数字
			{
				val += String.valueOf(random.nextInt(10));
			}
		}

		return val;
	}
	public static void main(String[] args){
		System.out.print(getCharAndNumr(6));
	}

}