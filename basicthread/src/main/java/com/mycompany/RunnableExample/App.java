package com.mycompany.RunnableExample;

public class App extends Thread {
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new App();

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
    }

    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
}
