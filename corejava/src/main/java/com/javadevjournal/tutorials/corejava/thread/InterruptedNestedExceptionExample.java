package com.javadevjournal.tutorials.corejava.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterruptedNestedExceptionExample implements  Runnable {


    private final AtomicBoolean running = new AtomicBoolean(true);


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
       while(true){
           for(int i=0; i <5; i++){
               try{
                   Thread.sleep(1000);
               }
              catch (InterruptedException interruptedException) {
                  if(running.get()){
                      Thread.currentThread().interrupt();
                  }
                  System.out.println("Shutting internal loop");
                  break;
               }
           }
           try{
               Thread.sleep(2000);
           } catch (InterruptedException e) {

               if(running.get()){
                   Thread.currentThread().interrupt();
               }

               System.out.println("Shutting outer loop");
               break;
           }
       }

        System.out.println("Closing down our main thread");
    }

    public static void testLoopExample(){

    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(new InterruptedExceptionExample());
        Thread.sleep(3000);
        executor.shutdownNow();
    }
}
