package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import driver.*;
import model.*;
import util.*;
public class HoldFileNameForFixing {
	private String filename;

	public HoldFileNameForFixing()
	{
		
	}
	public HoldFileNameForFixing(String filename)
	{
		this.filename = filename;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	/*
	public boolean openFile() throws FixProblems
	{
		FileInputStream a1 = null;
		boolean flag = false;
		try {
			a1 = new FileInputStream(fileName);
			System.out.println("Now it is done!");
			flag = true;
		}
		catch(FileNotFoundException f)
		{
			throw new FixProblems();
		}
		finally 
		{			
			
		}	
		return flag;	
	}	 */
	
	public boolean fixFile() throws CustomException
	{
		FileInputStream a1 = null;
		boolean flag = false;
		do {
			
			try {
				a1 = new FileInputStream(filename);
				System.out.println("Now it is done!");
				flag = true;
			}catch(FileNotFoundException e)
			{
				throw new CustomException(5, "file not found!!!");
			}
			finally 
			{			
				
			}	
		
		}while(flag == false);
		
		return flag;
	}
	
}
