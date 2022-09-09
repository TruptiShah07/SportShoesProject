package com.ShoesManagement.ExceptionHandler;

public class BusinessException extends Exception{

	private static final long serialVersionUID = 1008128726286682480L;

	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
		super(message);
	}
}