package com.deepakrohan.lambdas;

public class ThreadUsingLambdas {

    public static void main(String[] args) {
        /**
         * Thread accepts the runnable parameter
         */
        new Thread(() -> System.out.println("hello World")).start();
    }
}
