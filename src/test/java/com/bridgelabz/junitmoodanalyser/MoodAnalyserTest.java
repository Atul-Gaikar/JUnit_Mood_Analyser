package com.bridgelabz.junitmoodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void message() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
		String mood = moodAnalyser.analyseMood();
		// assertTrue( true );
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void message1() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void message2() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(" i am in any Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}