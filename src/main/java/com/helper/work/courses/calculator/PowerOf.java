package com.helper.work.courses.calculator;

public class PowerOf extends CalculateBase implements MathProcessing {

    @Override
    public void calculate() {
        final double pow = Math.pow(getLeftVal(), getRightVal());
        setResult(pow);
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }

    @Override
    public String getKeyword() {
        return "POWER";
    }
}
