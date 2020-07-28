package com.blankj.ADT;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-04 15:24
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThreadOne mto = new MyThreadOne();
        mto.start();

        MyThreadTwo mtt = new MyThreadTwo();
        Thread thread = new Thread(mtt);
        thread.start();
    }
}
