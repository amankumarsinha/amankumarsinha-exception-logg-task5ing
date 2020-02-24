package com.epam.simpleandcompoundinterest;
import java.util.*;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
public class MAin {
	
	private static final Logger LOGGER = LogManager.getLogger(MAin.class);

	public static void main(String args[])
	{
		double principle;
		float rate,time;
		Scanner sc=new Scanner(System.in);
		LOGGER.error("enter principle amount");
		principle=sc.nextDouble();
		LOGGER.error("enter rate of interest");
		rate=sc.nextFloat();
		LOGGER.error("enter time period");
		time=sc.nextFloat();
		LOGGER.error("choose---> ");
		LOGGER.error("1.Simple interest \n2.Compound interst");
		int ch=sc.nextInt();
		si_ci i=new si_ci();
		switch(ch)
		{
		case 1: 
			LOGGER.error("simple interst on sum "+principle+" with rate "+rate+" and time "+time+"years is\t"+i.simple(principle, rate, time)+"ruppes");
	         break;
		case 2:    
			LOGGER.error("compund interst on sum "+principle+" with rate "+rate+" and time "+time+"years is\t"+i.compound(principle, rate, time)+"ruppes");
		    break;
		    default:LOGGER.error("invalid choice");
		}
		
		
				
	}
}
