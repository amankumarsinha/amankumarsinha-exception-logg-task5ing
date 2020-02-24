package com.epam.houserate;
import java.io.IOException;


public class rate {

	public int getprice(int price ,float area) throws IOException
	{
		int cost=(int) (price*area);
		return cost;
	
	}
}
