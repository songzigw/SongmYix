package cn.songm.yix.service;

public class TestXmx {

    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        
        Thread t1 = new Thread(task, "abc1");
        Thread t2 = new Thread(task, "abc2");
        t1.start();
        t2.start();
        
        System.out.println(1);
        System.out.println(2);
    }
    
    public static class MyTask implements Runnable {

        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {
            threadLocal.set((int)(Math.random() * 100));
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            System.out.println(threadLocal.get());
        }
    }
}
