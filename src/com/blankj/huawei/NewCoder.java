package com.blankj.huawei;

import java.util.Scanner;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-19 17:40
 */
public class NewCoder {

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Double c = in.nextDouble();

        System.out.println(lcm(m, n));
    }
}
