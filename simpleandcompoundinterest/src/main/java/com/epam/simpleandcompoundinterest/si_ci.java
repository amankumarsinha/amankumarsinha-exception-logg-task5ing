package com.epam.simpleandcompoundinterest;
import java.math.*;
import java.util.*;


public class si_ci {
	double inrst=0;
	double rate=0;
	double simple(double p,float r,float t) {
		inrst=(p*r*t)/100;
		return inrst;
	}
	double compound(double p,float r,float t)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("1.yearly \t 2.halfly \t 3.quartely \t 4.monthly");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			rate=Math.pow((1+r/100),t);
			break;
		case 2:
			t=t*2;
			rate=Math.pow((1+r/200),t);
			break;
		case 3:
			t=t*4;
			rate=Math.pow((1+r/400),t);
			break;
		case 4:
			t=t*12;
			rate=Math.pow((1+r/1200),t);
			break;
		}
		inrst=(p*rate)-p;
		return inrst;
		
		
	}

}
