package com.bridgelabz.junitmoodanalyser;

public class MoodAnalyserRefactor {

	String message;

	public MoodAnalyserRefactor(String message) {
		this.message = message;
	}

	MoodAnalyserRefactor() {
	}

	public String analyseMood() {
		if (message.toLowerCase().contains("sad")) {
			return "SAD";
		}
		if (message.toLowerCase().contains("happy")) {
			return "SAD";
		}
		if (message.toLowerCase().contains("any")) {
			return "HAPPY";

		} else
			return "HAPPY";
	}
}