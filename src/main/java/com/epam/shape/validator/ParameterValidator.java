package com.epam.shape.validator;

public class ParameterValidator {
    private static final String REGEX_ARRAY = "^-?(\\d*[\\ \\-\\,]*)*";
    public boolean isValid(String string) {
        return string.matches(REGEX_ARRAY);
    }
}
