package com.example.exceptionHandlerUtility;

public class ExceptionHandler extends RuntimeException {
	
	public ExceptionHandler(String message){
		super(message);
	}

	public ExceptionHandler(String message,Throwable th){
		super(message,th);
	}
}
