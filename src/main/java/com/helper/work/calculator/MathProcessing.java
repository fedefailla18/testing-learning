package com.helper.work.calculator;

public interface MathProcessing {

    static final String SEPARATOR = " ";

    double doCalculation(double leftVal, double rightVal);

    String getKeyword();
}
