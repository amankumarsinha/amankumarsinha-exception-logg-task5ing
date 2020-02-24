package com.epam.houserate;

import java.io.IOException;

public class choice extends rate
{
	public int cost;
	public choice(int n,float area) throws IOException
	{
		rate r=new rate();
		
		switch(n)
		{
		case 1:cost=r.getprice(1200,area);
		         break;
		case 2:cost=r.getprice(1500,area);
		          break;
		case 3:cost=r.getprice(1800,area);
		        break;
		case 4:cost=r.getprice(2500,area);
		break;
		}
	}

	

}
