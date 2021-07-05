package com.bridgelabz.junitmoodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class HandleCustomeExceptionTest {

	@Test
	public void messageNull() throws HandleCustomeExceptionExtends {
		HandleCustomeException moodAnalyser = new HandleCustomeException(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void messagesEmpty() throws HandleCustomeExceptionExtends {
		HandleCustomeException moodAnalyser = new HandleCustomeException("");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}