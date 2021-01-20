package org.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM");
		//small d for date 
		String format = dateFormat.format(date);
		System.out.println(format);
	}

}
