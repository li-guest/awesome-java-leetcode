package com.blankj.ADT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Edward Gavin
 * @Create: 2020-03-11 20:21
 */
public class Test {

    public static void main(String[] args) throws IOException {
        int abc = 0;
        BinTree init = new BinTree();
        init.insertAsRoot(abc);
        init.insertAsLC(init.root, 1);
        init.insertAsRC(init.root, 2);

        init.preOrder_iteration_1(init.root);
        init.inOrderRecursion(init.root);


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('c');
        String acb = new String();
        Integer[] ab = new Integer[0];

        try {
           int a =  12/0;
        }catch (Exception e){
            System.out.println("error");
        }finally {
            System.out.println("ok");
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
    }
}
