package com.example.harjoitus3_1;

public class Counter {

    private int countValue;
    private int countMinValue;
    private int countMaxValue;

    public Counter(int countMinValue, int countMaxValue){
        this.countValue = 0;
        this.countMinValue = countMinValue;
        this.countMaxValue = countMaxValue;
    }

    public void increment() {
        if (this.countValue < this.countMaxValue) {
            this.countValue++;
        }
    }

    public void decrement() {
        if (this.countValue > this.countMinValue) {
            this.countValue--;
        }
    }

    public void reset() {
        this.countValue = 0;
    }

    public int getCountValue() {
        return this.countValue;
    }
}