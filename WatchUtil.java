package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.watch.Rolex;
import com.xworkz.xworkzapp.watch.Watch;

public class WatchUtil {
public static void main(String[] args) {
	

	                                                //   Rolex rolex=(Rolex) new Watch();-----one line downcosting
	                                                  //  Watch watch =new Rolex();  ----2line
	                                                   //Rolex rolex=(Rolex) watch;
	   // Rolex rolex=new Rolex();                                                  
	 //  rolex.modelNO="";
	  // rolex.price=123;
	  // System.out.println(rolex.modelNO+" "+rolex.price);
	
	Watch watch = new Rolex();
	watch.modelNo="RT420";
	watch.price=5678.99;
	
	watch.displayTime();
	
	System.out.println(watch.modelNo+" "+watch.price);
	   
}
}