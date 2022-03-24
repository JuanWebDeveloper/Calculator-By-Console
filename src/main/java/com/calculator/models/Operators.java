package com.calculator.models;

public class Operators {
    int numOne;
    int numTwo;
    int result;

    public Operators(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }
        
    public void sum() {
        result = numOne + numTwo;
        System.out.println("The sum of " + numOne + " + " + numTwo + " is " + result + "\n");
    }

    public void subtract() {
        result = numOne - numTwo;
        System.out.println("The subtract of " + numOne + " - " + numTwo + " is " + result + "\n");
    }

    public void multiply() {
       if (numOne == 0 || numTwo == 0) {
           System.out.println("The multiplication of " + numOne + " * " + numTwo + " is " + 0 + "\n");
       } else {
           int accountant = numTwo;

           while (accountant > 0) {
                result += numOne;
                accountant--;
           }

           System.out.println("The multiplication of " + numOne + " * " + numTwo + " is " + result + "\n");
       }
    }

    public void divide() {
        if (numTwo > numOne) {
            System.out.println("The divisor of the operation must be less than the dividend \n");
        } else if(numTwo == 0) {
            System.out.println("The divisor of the operation must be different than zero \n");
        } else {
            int accountant = numTwo;

            while (accountant <= numOne) {
                result++;
                accountant += numTwo;
            }

            System.out.println("The division of " + numOne + " / " + numTwo + " is " + result + "\n");
        }
        
    }

}
