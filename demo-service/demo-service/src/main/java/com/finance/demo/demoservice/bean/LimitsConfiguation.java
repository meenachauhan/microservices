package com.finance.demo.demoservice.bean;

public class LimitsConfiguation {

    private int max;

    private int min;

    protected LimitsConfiguation() {

    }

    public LimitsConfiguation(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }



}
