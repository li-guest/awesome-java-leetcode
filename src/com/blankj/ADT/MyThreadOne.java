package com.blankj.ADT;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-04 15:06
 */
public class MyThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+i+"----");
            }
        }
    }
}


