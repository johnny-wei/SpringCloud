package com.lychr.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private static Logger LOG= LoggerFactory.getLogger(DateUtils.class);
	/**
     * 获取日期所在年的第一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getDay(Date aDate){
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		int iDay=objCa.get(Calendar.DATE);
		objCa.set(iYear, iMonth, iDay, 0, 0, 0);
		return objCa.getTime();
	}
	public static Date getFirstDayOfYear(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		objCa.set(iYear, 0, 1, 0, 0, 0);
		return objCa.getTime();
	}

	/**
	 * 获取日期所在年的最后一天
	 * @param aDate: Date
	 * @return Date
	 */
	public static Date getLastDayOfYear(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		objCa.set(iYear, 0, 1, 0, 0, 0);
		objCa.add(Calendar.MONTH, 12);
		objCa.add(Calendar.DAY_OF_YEAR, -1);
		return objCa.getTime();
	}

	/**
	 * 获取日期所在季度的第一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getFirstDayOfQuarter(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		iMonth = (iMonth / 3 + 1) * 3 - 3;
		objCa.set(iYear, iMonth, 1, 0, 0, 0);
		return objCa.getTime();
	}

	/**
	 * 获取日期所在季度的最后一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getLastDayOfQuarter(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		iMonth = (iMonth / 3 + 1) * 3 - 3;
		objCa.set(iYear, iMonth, 1, 0, 0, 0);
		objCa.add(Calendar.MONTH, 3);
		objCa.add(Calendar.DAY_OF_YEAR, -1);
		return objCa.getTime();
	}

	/**
	 * 获取日期所在月的第一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getFirstDayOfMonth(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		objCa.set(iYear, iMonth, 1, 0, 0, 0);
		return objCa.getTime();
	}

	//获取日期所在上月最后一天
	public static Date getLastMonthLastDay(Date aDate){
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		objCa.add(Calendar.MONTH,-1);
		return getLastDayOfMonth(objCa.getTime());
	}
	//获取日期所在上月第一天
	public static Date getLastMonthFirstDay(Date aDate){
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		objCa.set(iYear, iMonth, 1, 0, 0, 0);
		objCa.set(Calendar.DATE,-1);
		return getFirstDayOfMonth(objCa.getTime());
	}

	/**
	 * 获取日期所在月的最后一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getLastDayOfMonth(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		objCa.set(iYear, iMonth, 1, 0, 0, 0);
		objCa.add(Calendar.MONTH, 1);
		objCa.add(Calendar.DAY_OF_YEAR, -1);
		return objCa.getTime();
	}

	/**
	 * 获取日期所在周的第一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getFirstDayOfWeek(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		int iDay = objCa.get(Calendar.DAY_OF_MONTH);
		int iDayOfWeek = objCa.get(Calendar.DAY_OF_WEEK);
		objCa.set(iYear, iMonth, iDay, 0, 0, 0);
		objCa.add(Calendar.DAY_OF_YEAR, -iDayOfWeek + 2);
		return objCa.getTime();
	}

	/**
	 * 获取日期所在周的最后一天
	 * @param aDate:Date
	 * @return Date
	 */
	public static Date getLastDayOfWeek(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		int iYear = objCa.get(Calendar.YEAR);
		int iMonth = objCa.get(Calendar.MONTH);
		int iDay = objCa.get(Calendar.DAY_OF_MONTH);
		int iDayOfWeek = objCa.get(Calendar.DAY_OF_WEEK);
		objCa.set(iYear, iMonth, iDay, 0, 0, 0);
		objCa.add(Calendar.DAY_OF_YEAR, -iDayOfWeek + 7);
		return objCa.getTime();
	}

	/**
	 * 加减年
	 * @param aDate:Date
	 * @param iYear:int
	 * @return Date
	 */
	public static Date addYear(Date aDate, int iYear) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		objCa.add(Calendar.MONDAY, iYear * 12);
		return objCa.getTime();
	}

	/**
	 * 加减季度
	 * @param aDate:Date
	 * @param iQuarter:int
	 * @return Date
	 */
	public static Date addQuarter(Date aDate, int iQuarter) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		objCa.add(Calendar.MONDAY, iQuarter * 3);
		return objCa.getTime();
	}

	/**
	 * 加减月
	 * @param aDate:Date
	 * @param iMonth:int
	 * @return Date
	 */
	public static Date addMonth(Date aDate, int iMonth) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		objCa.add(Calendar.MONDAY, iMonth);
		return objCa.getTime();
	}

	/**
	 * 加减周
	 * @param aDate:Date
	 * @param iWeek:int
	 * @return Date
	 */
	public static Date addWeek(Date aDate, int iWeek) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		objCa.add(Calendar.DAY_OF_YEAR, iWeek * 7);
		return objCa.getTime();
	}

	/**
	 * 加减日:
	 * @param aDate:Date
	 * @param iDay:int
	 * @return Date
	 */
	public static Date addDay(Date aDate, int iDay) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		objCa.add(Calendar.DAY_OF_YEAR, iDay);
		return objCa.getTime();
	}

	/**
	 * 加减时间
	 * @param aDate:Date
	 * @param aTime:long 毫秒
	 * @return Date
	 */
	public static Date addTime(Date aDate, long aTime) {
		Date dRtn = aDate;
		dRtn = new Date(dRtn.getTime() + aTime);
		return dRtn;
	}

	public static int getYear(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		return objCa.get(Calendar.YEAR);
	}

	public static int getQuarter(Date aDate) {
		int season = 0;
		Calendar c = Calendar.getInstance();
		c.setTime(aDate);
		int month = c.get(Calendar.MONTH);
		switch (month) {
		case Calendar.JANUARY:
		case Calendar.FEBRUARY:
		case Calendar.MARCH:
			season = 1;
			break;
		case Calendar.APRIL:
		case Calendar.MAY:
		case Calendar.JUNE:
			season = 2;
			break;
		case Calendar.JULY:
		case Calendar.AUGUST:
		case Calendar.SEPTEMBER:
			season = 3;
			break;
		case Calendar.OCTOBER:
		case Calendar.NOVEMBER:
		case Calendar.DECEMBER:
			season = 4;
			break;
		default:
			break;
		}
		return season;
	}

	public static int getMonth(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		return objCa.get(Calendar.MONTH) + 1;
	}

	public static int getHour(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		return objCa.get(Calendar.HOUR) + 1;
	}

	public static int getDayOfMonth(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		return objCa.get(Calendar.DAY_OF_MONTH);
	}

	public static int getDayOfWeek(Date aDate) {
		Calendar objCa = Calendar.getInstance();
		objCa.setTime(aDate);
		return objCa.get(Calendar.DAY_OF_WEEK);
	}

	public static int getDaysBt(Date dFrom, Date dTo) {
		long lRtn = 0;
		long lFrom = trunc(dFrom, "yyyyMMdd").getTime();
		long lTo = trunc(dTo, "yyyyMMdd").getTime();
		lRtn = (lTo - lFrom) / (24l * 60l * 60l * 1000l);
		return new Long(lRtn).intValue();
	}

	public static int getMonthsBt(Date dFrom, Date dTo) {
		int iRtn = 0;
		int iFromYear = getYear(dFrom), iFromMonth = getMonth(dFrom);
		int iToYear = getYear(dTo), iToMonth = getMonth(dTo);
		iRtn = iToYear * 12 + iToMonth - iFromYear * 12 - iFromMonth;
		return iRtn;
	}

	public static int getYearsBt(Date dFrom, Date dTo) {
		int iRtn = 0;
		iRtn = getYear(dFrom) - getYear(dTo);
		return iRtn;
	}

	/**
	 * 两个时间之差
	 * @param dFrom
	 * @param dTo
	 * @return
	 */

	public static long getTimeBt(Date dFrom, Date dTo) {
		long lRtn = 0;
		long lFrom = trunc(dFrom, "yyyy-MM-dd HH:mm:ss").getTime();
		long lTo = trunc(dTo, "yyyy-MM-dd HH:mm:ss").getTime();
		lRtn = lTo - lFrom;
		return lRtn;
	}

	public static Date parseDate(String aData, String aFormat)
			throws RuntimeException {
		Date objDate = null;
		SimpleDateFormat objFormat = new SimpleDateFormat(aFormat);
		try {
			objDate = objFormat.parse(aData);
		} catch (Exception ex) {
			objDate = null;
		}
		return objDate;
	}

	/**
	 * 格式化日期
	 * @param aDate:Date
	 * @param aFormat:String yyyy.MM.dd HH:mm:ss
	 * @return String
	 */
	public static String formatDate(Date aDate, String aFormat) {
		String strRtn = "";
		if (aDate != null) {
			SimpleDateFormat objFormat = new SimpleDateFormat(aFormat);
			strRtn = objFormat.format(aDate);
		}
		return strRtn;
	}

	public static String formatDate(String aFormat) {
		String strRtn = "";
		Date dDate = new Date();
		SimpleDateFormat objFormat = new SimpleDateFormat(aFormat);
		strRtn = objFormat.format(dDate);
		return strRtn;
	}
	public static long dateToStamp(String s) {
		Date date=new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
				date = simpleDateFormat.parse(s);
		}catch (ParseException e){
			LOG.info("时间转换异常");
		}
		long ts = date.getTime();
		return ts;
	}


	public static boolean isSameDay(Date target){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(target);
		Calendar calendar2=Calendar.getInstance();
		calendar2.setTime(new Date());
		if (calendar.get(Calendar.YEAR)==calendar2.get(Calendar.YEAR)
				&&calendar.get(Calendar.MONTH)==calendar2.get(Calendar.MONTH)
				&&calendar.get(Calendar.DATE)==calendar2.get(Calendar.DATE)){
			//同一天
			return true;
		}else {
			//第二天
			return false;
		}
	}

	public static Date trunc(Date aDate, String aFormat) {
		return parseDate(formatDate(aDate, aFormat), aFormat);
	}

	public static Date trunc(String aFormat) {
		return parseDate(formatDate(new Date(), aFormat), aFormat);
	}

	public static Date getSysDate() {
		return new java.sql.Date(new Date().getTime());
	}

	public static Date getSysTime() {
		return new java.sql.Timestamp(new Date().getTime());
	}
	/***
	 *  功能描述：日期转换cron表达式
	 * @param date
	 * @param dateFormat : e.g:yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String formatDateByPattern(Date date,String dateFormat){
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String formatTimeStr = null;
		if (date != null) {
			formatTimeStr = sdf.format(date);
		}
		return formatTimeStr;
	}
	/***
	 * convert Date to cron ,eg.  "0 07 10 15 1 ? 2016"
	 * @param date  : 时间点
	 * @return
	 */
	public static String getCron(Date  date){
		String dateFormat="ss mm HH dd MM ?";
		return formatDateByPattern(date, dateFormat);
	}
	public static void main(String[] args){
		System.out.print(isSameDay(new Date()));
	}
}
