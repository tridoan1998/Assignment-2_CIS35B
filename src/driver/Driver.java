/*
Name: Tri Doan
Course: 35B
Assignment: Lab 2
Description: In this project we will build a Car Configuration Application. 
In this unit  we will develop a “reference” base object model, 
read a text file to build the reference base object model and archive it using Serialization.
Due Date: 05/03/2019
Turn in Date: 05/03/2019
 */

package driver;
import model.*;
import util.*;
import exception.*;

// FIX SWITCH IN CustomException class


public class Driver {
// throws CustomException
	public static void main(String[] args){
		boolean error = true;
		String FileName = "C:Users\\Tri Doan\\eclipse-workspace\\Assignment 2_CIS35B\\src\\data.txt";			

		while(error == true)
		{
			try {
			
				Automobile Car = new Automobile(5, "Focus Wagon ZTW", 18455);
				FileIO File = new FileIO();
				File.buildAutomotiveObject(FileName, Car);	
				
				
				Car.print();
				Car.deleteOptionSet(1);
				Car.deleteOption(0,2);
				System.out.println(Car.findOptionSet("Brakes/TractionControl"));
				System.out.println(Car.findOption("Standard", 3));			
				Car.updateOptionSetName("Root Top", 4);
				Car.updateOptionName("Carbon Fiber",4, 0);
				Car.updateOptionPrice(524, 3,1);
				System.out.println("---------------------------------------------");
				File.Serialize(Car);
				File.Deserialize("file.ser", Car);
				Car.print();
				error = false;
				}

			
			catch(CustomException e)
			{
				error = true;
				FileName = e.printmyproblem();				
			}
	}
}
}

//					TEST RUN #1
/*

 */
// 					TEST RUN #2
/*

 */