package com.bridgelabz.junitmoodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserRefactorTest {
	@Test
	public void message() {
		MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("i am in sad mood");
		String mood = moodAnalyser.analyseMood();
		// assertTrue( true );
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void messagesad() {
		MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor("i am in happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void messagehappy() {
		MoodAnalyserRefactor moodAnalyser = new MoodAnalyserRefactor(" i am in any Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}
