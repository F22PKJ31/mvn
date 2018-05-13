package com.sac.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate extends Date{
	private Date Date;
	private SimpleDateFormat sdf;

	public MyDate(Date date) {
		super();
		this.Date = date; 
		sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		
	}

	@Override
	public String toString() {
		return sdf.format(Date);
	}
	
}
