package com.mycompany.model;

public class InputModel {
    private String text;

    public InputModel(final String text) {
        this.text = text;
    }

    public InputModel() {
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "InputModel{" +
                "text='" + text + '\'' +
                '}';
    }
}
