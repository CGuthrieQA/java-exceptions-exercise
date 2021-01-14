package com.qa.main;

public class ASmallerThanBException extends ArithmeticException {

	public ASmallerThanBException(String errorMessage) {
        super(errorMessage);
    }
	public ASmallerThanBException() {
        super();
    }

}