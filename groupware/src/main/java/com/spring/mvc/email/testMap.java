package com.spring.mvc.email;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testMap {
	public static void main(String[] args) {		
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy,MM,dd,HH,mm,ss");
		Date day = new Date();
		String day1 = date1.format(day);	
		String day2 = "2012,04,9,10,19,30";
		System.out.println(day1);
		System.out.println(day2);
		
		String[] getday1 = day1.split(",");
		String[] getday2 = day2.split(",");
		
		int[] getday11 = new int[getday1.length];
		int[] getday22 = new int[getday2.length];
		
		for(int i=0;i<getday1.length;i++) {
			getday11[i] = Integer.parseInt(getday1[i]);
			getday22[i] = Integer.parseInt(getday2[i]);
		}
		
			String lefted = "";
		
		if(getday11[0]!=getday22[0]) {
			int years = getday11[0]-getday22[0];
			lefted = years+"�� ��";
		}else if(getday11[1]!=getday22[1]) {
			int months = getday11[1]-getday22[1];
			System.out.println(months+"媛��� ��");
		}else if(getday11[2]!=getday22[2]) {
			int days = getday11[2]-getday22[2];
			System.out.println(days+"�� ��");
		}else if(getday11[3]!=getday22[3]) {
			int hours = getday11[3]-getday22[3];
			System.out.println(hours+"��媛� ��");
		}else if(getday11[4]!=getday22[4]) {
			int minutes = getday11[4]-getday22[4];
			System.out.println(minutes+"遺� ��");
		}else {//if(getday11[5]!=getday22[5]) {
			int seconds = getday11[5]-getday22[5];
			System.out.println(seconds+"珥� ��");
		}
			System.out.println(lefted);
	}
}













