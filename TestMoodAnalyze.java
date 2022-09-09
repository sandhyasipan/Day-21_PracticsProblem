package com.bridgelab;


public class TestMoodAnalyze {
    public void givenMessage_whenAnalyze_thenRespondSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAnalyze_thenRespondHAPPY(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
