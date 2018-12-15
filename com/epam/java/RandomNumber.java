package com.epam.java;

public class RandomNumber {
    private Integer number;
    private boolean sign;

    public RandomNumber() {
    }

    public Integer getNumber() {
        return number;
    }

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
