package com.bridgelabz.junitmoodanalyser;

public class UsabilityToAnalyseMood {

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}