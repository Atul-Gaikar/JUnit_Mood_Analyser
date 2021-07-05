package com.bridgelabz.junitmoodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class HandleExceptionTest {

	@Test
	public void messageNull() throws HandleExceptionExtends {
		HandleException moodAnalyser = new HandleException(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void messagesEmpty() throws HandleExceptionExtends {
		HandleException moodAnalyser = new HandleException("");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}