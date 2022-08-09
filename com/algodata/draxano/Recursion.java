package com.algodata.draxano;

public class Recursion {
    // Constructor for the recursion class. We can practice on with given n input, if we create recursion object.
    Recursion() {
    }

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }


//Question 1: How to find a sum of digits of a positive integer number using recursion?
//
//        Step 1 → Recursive case, the flow
//
//        10 = 10/10 = 1 with the remainder of 0 → 1
//
//        54 = 54/10 = 5 with the remainder of 4 → 9
//
//        112 = 112/10 = 11 with the remainder of 2, 11/10 = 1 with the remainder of 1 → 14?

    // Unfortunately this method only works fro two digits and 3 digits is error prone 
    public int question1(int n) {
        if(n == 0){
            return 0;
        }
        return n % 10 + question1(n / 10);
    }

}