package exception;
import java.io.*;
import java.util.*;
import driver.*;
import model.*;
import util.*;
//RuntimeException: In Java, there are two types of exceptions: checked exceptions and un-checked 
//exceptions.A checked exception must be handled explicitly by the code, whereas, an un-checked
//exception does not need to be explicitly handled.
/*
For checked exceptions, you either have to put a try/catch block around the code that could 
potentially throw the exception, or add a "throws" clause to the method, to indicate that the 
method might throw this type of exception (which must be handled in the calling class or above).
 */
public class CustomException extends Exception {
	public static final long serialVersionUID = 42L;
	private int errornum;
	private String message;
	
	public CustomException(int error_code, String message)
	{
		super();
		this.errornum = error_code;
		this.message = message;
		printmyproblem();
	}
	
	public void printmyproblem()
	{
		switch(errornum)
		{
			case 1:
				System.out.println(message);
				break;
			case 2:
				System.out.println(message);
				break;				
			case 3:
				System.out.println(message);
				break;
			case 4:
				System.out.println(message);
				break;
			case 5:
				boolean flag = false;
				String file;
				System.out.printf("%s", "Enter filename: ");
				Scanner input = new Scanner(System.in);
				file = input.nextLine();
				while(flag == false)
				{
					System.out.println("Wrong filename!");
					System.out.printf("%s", "Please enter filename again: ");
					file = input.nextLine();
					if(file.equals("data.txt"))
					{
						flag = true;
					}
				}
				file = "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 2_CIS35B\\src\\data.txt";
				input.close();
				break;
			case 6:
				System.out.println(message);
				break;
			default:
				break;
		}
	}
}