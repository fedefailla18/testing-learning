package com.helper.work.courses.calculator;

import lombok.Getter;

public enum MathOperation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    @Getter
    private String value;

    MathOperation(String s) {
        value = s;
    }
}
