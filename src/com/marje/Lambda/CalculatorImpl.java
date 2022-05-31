package com.marje.Lambda;

interface Calculator{
    /**
     void switchOn();
     void sum(int n1, int n2);
    */
    int multiply(int n1, int n2);
}

public class CalculatorImpl {

    public static void main(String[] args) {

        /**
         * Calculator calculator = () -> {
         *              System.out.println("Calculator switched On !!");
         *          };
         *          calculator.switchOn();
         * */

        /**
         * Calculator calculator = (n1, n2) -> {
         *             System.out.println("Sum: " + (n1 + n2));
         *         };
         *         calculator.sum(5, 3);
         */

        Calculator calculator = (n1, n2) -> n1*n2;
        System.out.println("Multiplication "+ calculator.multiply(2,3));
    }
}


/*

## Traditional Way

public class CalculatorImpl implements Calculator {
    @Override
    public void switchOn() {
        System.out.println("Calculator switched On !!");
    }
}

*/

