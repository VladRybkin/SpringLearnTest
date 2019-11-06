package ua.training.service.impl;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Component
public class MultithreadingService {

   public void threadPoolExec() {

        List<Runnable> runnables = new ArrayList<>();
        runnables.add(new MyRunnable1());
        runnables.add(new MyRunnable2());
        runnables.add(new MyRunnable3());

//        ExecutorService service = Executors.newFixedThreadPool(2);
//        runnables.forEach(service::submit);
//
//        service.shutdown();
        ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        runnables.forEach(executor::submit);
        executor.shutdown();

    }

    class MyRunnable1 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5000; i++) {
                System.out.println(i);
            }
        }
    }

    class MyRunnable2 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("run");
            }
        }
    }

    class MyRunnable3 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("hellof");
            }
        }
    }

}
