package com.blankj.ByteDance;

import java.util.Scanner;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-22 12:03
 */
public class FindMidNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(",");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        for (int num : nums) {
            System.out.println(num);
        }


    }
}
