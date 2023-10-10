package ru.netology;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {

        return (int) target.newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(Calculator.Operation.SUM)
                .result();

    }

    @Override
    public int mult(int arg0, int arg1) {

        return (int) target.newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(Calculator.Operation.MULT)
                .result();

    }

    @Override
    public int pow(int a, int b) {

        return (int) target.newFormula()
                .addOperand((double) a)
                .addOperand((double) b)
                .calculate(Calculator.Operation.POW)
                .result();

    }
}