package com.deze.recipe_project.model;

public enum  Difficulty {

    EASY("EASY"),
    MODERATE("MODERATE"),
    KINDAHARD("KINDAHARD"),
    HARD("HARD");

    private final String displayValue;

    private Difficulty(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

}
