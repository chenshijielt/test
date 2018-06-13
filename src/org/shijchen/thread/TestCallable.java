package org.shijchen.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();

        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        FutureTask<Integer> result = new FutureTask<>(td);

        new Thread(result).start();

        //2.接收线程运算后的结果
        try {
            Integer sum = result.get();  //线程在运行的时候，FutureTask 的get方法并没有执行，而是在等待线程运行的结果。FutureTask 可用于 闭锁
            System.out.println(sum);
            System.out.println("------------------------------------");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo2 implements Callable<Integer> {

    @Override
    public Integer call()  {
        int sum = 0;

        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }

        return sum;
    }

}

/*
原来创建线程的方式
class ThreadDemo implements Runnable{

    @Override
    public void run() {
    }

}*/
