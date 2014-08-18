package com.barun.hackerearth.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		String []dateSeq = "2013-10-30T00:00:00+01:00".split(":");
		String newString = dateSeq[0]+":"+dateSeq[1]+":"+dateSeq[2]+dateSeq[3];
		System.out.println(deserializeDateYYYY_MM_DD_T_HH_MM_SS_Z(newString));

	}

	public static Date deserializeDateYYYY_MM_DD_T_HH_MM_SS_Z(String date) throws ParseException {
		String []dateSeq = date.split(":");
		String newString = dateSeq[0]+":"+dateSeq[1]+":"+dateSeq[2]+dateSeq[3];
		return deserializeDate(newString, "yyyy-MM-dd'T'HH:mm:ssZ");
	}
	public static Date deserializeDate(String date, String format) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		calendar.setTime(simpleDateFormat.parse(date));
		return calendar.getTime();
	}
}
