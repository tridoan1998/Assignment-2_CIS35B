/*
Name: Tri Doan
Course: 35B
Assignment: Lab 1
Description: In this project we will build a Car Configuration Application. 
In this unit  we will develop a “reference” base object model, 
read a text file to build the reference base object model and archive it using Serialization.
Due Date: 04/23/2019
Turn in Date: 04/23/2019
 */

package driver;
import model.*;
import util.*;
import exception.*;
import java.util.*;

public class Driver {
// throws CustomException
	public static void main(String[] args){
		boolean flag = false;
		do {
			try {
				Automobile Car = new Automobile(5, "Focus Wagon ZTW", 18455);
				FileIO File = new FileIO();
				
				String filee;
				System.out.printf("%s", "Enter filename: ");
				Scanner input = new Scanner(System.in);
				filee = input.nextLine();
				input.close();
				if(!filee.equals("data.xt"))
				{
					throw new CustomException(5, "Wrong input file!");
				}
				
				File.buildAutomotiveObject(filee, Car);		
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
			}catch(CustomException e)
			{
				e.printmyproblem();
			}
		}while(flag == false);
		
		
		
		/*
	try {
			Automobile Car = new Automobile(5, "Focus Wagon ZTW", 18455);
			FileIO File = new FileIO();
			
			boolean flagg = false;
			String file;
			System.out.printf("%s", "Enter filename: ");
			Scanner input = new Scanner(System.in);
			file = input.nextLine();
			while(flagg == false)
			{
				System.out.println("Wrong filename!");
				System.out.printf("%s", "Please enter filename again: ");
				file = input.nextLine();
				if(file.equals("data.txt"))
				{
					flagg = true;
				}
			}
			file = "C:\\Users\\Tri Doan\\eclipse-workspace\\Assignment 2_CIS35B\\src\\data.txt";
			input.close();
			
			File.buildAutomotiveObject(file, Car);		
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
		}catch(CustomException e)
		{	
			e.printmyproblem();
		}		 */
		
	
	}
}


//					TEST RUN #1
/*

 */
// 					TEST RUN #2
/*

 */