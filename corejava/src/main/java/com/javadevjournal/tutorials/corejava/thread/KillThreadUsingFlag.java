package com.javadevjournal.tutorials.corejava.thread;

import java.util.concurrent.atomic.AtomicBoolean;

public class KillThreadUsingFlag implements Runnable {


    private final AtomicBoolean running = new AtomicBoolean(false);
    private Thread thread;

    /**
     * When an object implementing interface <code>Runnable</code> is used to create a thread,
     * starting the thread causes the object's <code>run</code> method to be called in that
     * separately executing thread. <p> The general contract of the method <code>run</code> is that
     * it may take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        while (running.get()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("Shutting down thread");
    }

    public void shutdown() {
        running.set(false);
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args)
            throws InterruptedException {
        KillThreadUsingFlag process = new KillThreadUsingFlag();
        process.start();
        Thread.sleep(5000);
        process.shutdown();
    }
}
