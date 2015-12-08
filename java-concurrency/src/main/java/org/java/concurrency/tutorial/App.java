package org.java.concurrency.tutorial;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FirstRunnableClass firstClass = new FirstRunnableClass();
        firstClass.run();
        System.out.println( "Hello World!" );
    }
}
