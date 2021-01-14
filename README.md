# Exercises

##Division With Exceptions

1. Create a program that can take two ints as input from the user and can produce the division of these numbers.
You can use the Maths project created earlier.
This method will need to catch two specific exceptions as well as an overall third exception.

2. Handle each of these exceptions within the method and handle them in different ways.

3. Recreate the division method to throw your own bespoke exception.
This exception will be thrown if the user tries to divide a number (a) by a larger number (b).
	* Create a separate class that will be your exception, this class will extend the Exception class.
	* Create and implement the division method so that it takes account of your new exception.
	* Handle this exception in varying ways to show the flexibility of exception handling.

```Java
package com.qa.main;

public class ASmallerThanBException extends ArithmeticException {

	public ASmallerThanBException(String errorMessage) {
        super(errorMessage);
    }
	public ASmallerThanBException() {
        super();
    }

}
```

```Java
package com.qa.main;

public class DivZeroException extends ArithmeticException{
	
	public DivZeroException(String errorMessage) {
        super(errorMessage);
    }
	
	public DivZeroException() {
        super();
    }

}

```

```Java
package com.qa.main;

import java.util.Scanner;

public class Runner {

	// new Scanner
	public static Scanner input = new Scanner(System.in);
	
	// everything in here
	public static void run() {
		
		System.out.println("scanner is running");
		
		// variables
		String result;
		int a = 0;
		int b = 0;
		double maths = 0.0;
		
		System.out.println("\rplease enter the first number:");
		
		result = Runner.input.nextLine();
		
		try {
			a = Integer.parseInt(result);
		} catch (NumberFormatException e){
			System.out.println("\rfirst number error: " + e.getMessage());
		} finally {
			System.out.println("\rfirst number set to: " + a);
		}
		

		System.out.println("\rplease enter the second number:");
		
		result = Runner.input.nextLine();
		
		try {
			b = Integer.parseInt(result);
		} catch (NumberFormatException e){
			System.out.println("\rscond number error: " + e.getMessage());
		} finally {
			System.out.println("\rsecond number set to: " + b);
		}


		try {
			maths = divide(a,b);
			System.out.println("\r" + a + " / " + b + " = " + maths);
		} catch (ArithmeticException e) {
			System.out.println("\rarithmetic exception message is: " + e.getMessage());
		}	
		
		
	}
	
	// custom error message implementation
	
	private static double divide(int a, int b) throws ArithmeticException {
		if ( b==0 ) {
			throw new DivZeroException("tried to divide by 0!");
		}
		
		if ( b > a ) {
			throw new ASmallerThanBException("b is bigger than a!");
		}
		
		return (double) a / b;
	}
	
	// main method
	public static void main(String[] args) {
		
		run();
		
		input.close();
		
		System.out.println("\rclosed input");

	}

}

```