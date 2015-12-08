package org.java.concurrency.tutorial;

/**
 * Created by tharanga on 12/6/15.
 */
public class FirstRunnableClass {

    public void run(){
        Runnable runnable = () -> {
            String threadname = Thread.currentThread().getName();
            System.out.println("Hello " + threadname);
        };
        runnable.run();

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("Done !");
    }
}
