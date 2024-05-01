package com.pollo.museumchatbot.domain;

import java.util.List;

public class FaqAnswer {

    private List<String> keywords;

    private String answer;

    public FaqAnswer(List<String> keywords, String answer) {}

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
