package com.deepakrohan.lambdas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();
    }
}
