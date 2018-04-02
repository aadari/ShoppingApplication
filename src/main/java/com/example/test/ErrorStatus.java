package com.example.test;

public class ErrorStatus extends Exception{

	private String message;
	private String code;
	
	public ErrorStatus(String message, String code){
		this.message = message;
		this.code = code;
	}
}
