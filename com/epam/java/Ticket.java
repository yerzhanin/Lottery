package com.epam.java;

public class Ticket {
    RandomNumber[] numbers;

    public Ticket(Integer allPlayingNumbersCount) {
        numbers = new RandomNumber[allPlayingNumbersCount];
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = new RandomNumber();
        }
    }

    public RandomNumber[] getNumbers() {
        return numbers;
    }

    public void setNumbers(RandomNumber[] numbers) {
        this.numbers = numbers;
    }
}
