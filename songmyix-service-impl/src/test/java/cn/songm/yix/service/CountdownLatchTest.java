package cn.songm.yix.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchTest {

    public static void main2(String[] args) {
        // 创建线程池
        ExecutorService service = Executors.newCachedThreadPool();
        final CountDownLatch cdOrder  = new CountDownLatch(1);
        final CountDownLatch cdAnswer = new CountDownLatch(3);
        
        for (int i  = 0; i < 3; i++) {
            Runnable runnable = new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println("线程" + Thread.currentThread().getName() + "正准备接受命令");
                        cdOrder.await();
                        System.out.println("线程" + Thread.currentThread().getName() + "已经接受命令");
                        Thread.sleep((long)(Math.random() * 10 * 1000));
                        System.out.println("线程" + Thread.currentThread().getName() + "回应命令处理结果");
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        cdAnswer.countDown();
                    }
                }
                
            };
            service.execute(runnable);
        }
        
        try {
            Thread.sleep((long)(Math.random() * 10 * 1000));
            System.out.println("线程" + Thread.currentThread().getName() + "即将发布命令");
            cdOrder.countDown();
            System.out.println("线程" + Thread.currentThread().getName() + "已发布命令，正在等待结果");
            cdAnswer.await();
            System.out.println("线程" + Thread.currentThread().getName() + "已经收到所有响应结果");
        } catch (Exception e) {
            
        } finally {
            
        }
        service.shutdown();
    }
    
    public static void main1(String[] args) {
        // 定义线程池
        ExecutorService service = Executors.newCachedThreadPool();
        int n = 3;
        CountDownLatch latch1 = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(n);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程"+Thread.currentThread().getName());
                try {
                    latch1.await();
                    System.out.println("线程"+Thread.currentThread().getName()+"执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch2.countDown();
                }
            }
        };
        for (int i = 0; i < n; i++) {
            service.execute(runnable);
        }
        System.out.println("线程"+Thread.currentThread().getName());
        try {
            Thread.sleep((long)(Math.random() * 10 * 1000));
            latch1.countDown();
            latch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程"+Thread.currentThread().getName()+"结束");
        service.shutdown();
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, 13 + 9*60 + 2*24*60);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(cal.getTime()));
    }
}
