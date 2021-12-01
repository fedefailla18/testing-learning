package com.helper.work.calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CalculateBase {

    private double rightVal;
    private double leftVal;
    private double result;

    public void calculate() {}
}
