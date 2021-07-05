package com.bridgelabz.junitmoodanalyser;

public class HandleExceptionExtends extends Exception {
	static ExceptionTypes message;

	enum ExceptionTypes {
		NULL_POINTER_EXCEPTION, EMPTY_STRING_EXCEPTION, UNDEFINED_MOOD_EXCEPTION;
		public class EMPTY_STRING_EXCEPTION extends Exception {

		}
	}

	public HandleExceptionExtends(ExceptionTypes message) {
		super(String.valueOf(message));
		this.message = message;
	}
}