package exception;

import java.util.*;
import java.util.Scanner;  // Import the Scanner class

public class Fix1to100 {
	public Fix1to100()
	{
		
	}
	
	public String fixfilename()
	{	
	//	Scanner input = new Scanner(System.in);
	//	System.out.printf("Enter a file name: ");
		
	//	String userinput = input.nextLine();
	//	System.out.println(userinput);
		return "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 2_CIS35B\\src\\data.txt";
	}
	
	public String fixerror1()
	{
		return "Wrong input for Option Set size";
	}
	public String fixerror2()
	{
		return "Price of the car should not be less than $0";
	}
	public String fixerror3()
	{
		return "Array Index Out Of Bounds";
	}	
	public String fixerror4()
	{
		return "Null Pointer Exception";
	}
}