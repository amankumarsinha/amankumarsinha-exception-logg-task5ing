package com.epam.houserate;
import java.io.IOException;
import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class houseprice extends choice {
	public houseprice(int n, float area)throws IOException
	{
		super(n, area);
		System.out.print(super.cost+"ruppees");
		
	}
	private static final Logger LOGGER = LogManager.getLogger(houseprice.class);

	public static void main(String[] args)throws IOException
	{
	 int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the area \n");
	float area =sc.nextFloat();
	LOGGER.error("enter your choice\n");
	LOGGER.error("1.Standard materials\n");
	LOGGER.error("2.Above standard material\n");
	LOGGER.error("3.high standard material\n");
	LOGGER.error("4.high standard mterial and fully automated home");
	ch=sc.nextInt();
	new houseprice(ch,area);
	
	sc.close();}
	

}
