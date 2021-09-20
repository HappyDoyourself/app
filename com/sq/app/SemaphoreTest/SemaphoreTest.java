package com.sq.app.SemaphoreTest;

import java.util.concurrent.*;

/**
 * @Author fanht
 * @Description
 * @Date 2020/7/23 下午2:34
 * @Version 1.0
 */
public class SemaphoreTest {
    public static void main(String[] args) {
       // ExecutorService executorService = Executors.newCachedThreadPool();
         ExecutorService executor = new ThreadPoolExecutor(50, 100, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(20));

        final Semaphore sem = new Semaphore(5);

        for(int index = 0;index<50;index ++){
            final  int no = index;

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        sem.acquire();
                        System.out.println("当前进入人数：" + no);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        sem.release();
                        System.out.println("**");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            executor.execute(runnable);

        }
        executor.shutdown();
    }
}
