package com.bridgelabz.junitmoodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class UsabilityToAnalyseMoodTest {
	@Test
	public void MessageSad() {
		UsabilityToAnalyseMood moodAnalyser = new UsabilityToAnalyseMood();
		String mood = moodAnalyser.analyseMood("I am is in sad Mood");
		// assertTrue( true );
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void MessageHappy() {
		UsabilityToAnalyseMood moodAnalyser = new UsabilityToAnalyseMood();
		String mood = moodAnalyser.analyseMood("I am is in any Mood");
		Assert.assertEquals("HAPPY", mood);
	}

	

}