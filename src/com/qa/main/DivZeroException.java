package com.qa.main;

public class DivZeroException extends ArithmeticException{
	
	public DivZeroException(String errorMessage) {
        super(errorMessage);
    }
	
	public DivZeroException() {
        super();
    }

}
