package com.bridgelabz.junitmoodanalyser;

public class HandleException {

	String message;

	public HandleException(String message) {
		this.message = message;
	}

	public String analyseMood() throws HandleExceptionExtends {
		try {
			if (message.equals(null)) {
				throw new HandleExceptionExtends(HandleExceptionExtends.ExceptionTypes.NULL_POINTER_EXCEPTION);
			} else if (message.isEmpty()) {
				throw new HandleExceptionExtends(HandleExceptionExtends.ExceptionTypes.EMPTY_STRING_EXCEPTION);
			}
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			return "HAPPY";
		} catch (Exception e) {
			e.printStackTrace();

			return "HAPPY";
		}
	}
}