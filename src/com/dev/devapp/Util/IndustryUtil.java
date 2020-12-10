package com.dev.devapp.Util;

import com.dev.devapp.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
		
		SteelIndustry industry=new SteelIndustry("sales", 34, "HSR Layout");
//		industry.setArea("HSR Layout");
//		industry.setNoOfWorkers(34);
//		industry.setType("sales");
		
		System.out.println(industry.getType()+ " "+ industry.getNoOfWorkers() + " "+industry.getArea() );
	}

}
