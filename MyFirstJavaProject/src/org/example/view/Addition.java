package org.example.view;

public class Addition {

	int numberOne = 90;
	int numberTwo = 90;
	int result;
	
	void sum() {			//method sum no return type
		result = numberOne + numberTwo;		//Arithmetic Operation +
		System.out.println("The Result of numberOne and number Two is:" + result);
		
	}
	
	void dispaly() {			//method display no return type
		int numberOne = 10;		//Variable Declaration and Initialization in one line  
		System.out.println(numberOne);
	}
	

	public static void main(String args[]) {  //Main Method Entry Point
	
	Addition objAddition = new Addition();  //Constructor
	objAddition.sum();   //Calling sum function
	objAddition.dispaly();  //Calling display function
}

}