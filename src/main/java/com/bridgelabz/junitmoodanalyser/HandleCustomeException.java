package com.bridgelabz.junitmoodanalyser;

public class HandleCustomeException {

	String message;

	public HandleCustomeException(String message) {
		this.message = message;
	}

	public String analyseMood() throws HandleCustomeExceptionExtends {
		try {
			if (message.equals(null)) {
				throw new HandleCustomeExceptionExtends(HandleCustomeExceptionExtends.ExceptionTypes.NULL_POINTER_EXCEPTION);
			} else if (message.isEmpty()) {
				throw new HandleCustomeExceptionExtends(HandleCustomeExceptionExtends.ExceptionTypes.EMPTY_STRING_EXCEPTION);
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