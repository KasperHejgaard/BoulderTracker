package com.example.bouldertrack.models;

public enum Difficulty {

    FOUR_A("4a"),
    FOUR_B("4b"),
    FOUR_C("4c"),

    FIVE_A("5a"),
    FIVE_B("5b"),
    FIVE_C("5c"),

    SIX_A("6a"),
    SIX_A_PLUS("6a+"),
    SIX_B("6b"),
    SIX_B_PLUS("6b+"),
    SIX_C("6c"),
    SIX_C_PLUS("6c+"),

    SEVEN_A("7a"),
    SEVEN_A_PLUS("7a+"),
    SEVEN_B("7b"),
    SEVEN_B_PLUS("7b+"),
    SEVEN_C("7c"),
    SEVEN_C_PLUS("7c+"),

    EIGHT_A("8a"),
    EIGHT_A_PLUS("8a+"),
    EIGHT_B("8b"),
    EIGHT_B_PLUS("8b+"),
    EIGHT_C("8c"),
    EIGHT_C_PLUS("8c+");


    private final String displayName;

    Difficulty(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    public int getNumericValue() {
        return this.ordinal() + 1;
    }


}
