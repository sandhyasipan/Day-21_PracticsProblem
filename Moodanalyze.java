package com.bridgelab;

public class Moodanalyze {
    private String message;

    public Moodanalyze(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
