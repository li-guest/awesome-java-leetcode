package com.blankj.ADT;

import java.util.Scanner;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-22 17:47
 */
public class InputFormatSummary {


    /**
     * Simple line input
     * @return
     */
    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(",");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        return nums;
    }

    /**
     * Multiple line input
     * @return
     */
    public void multipleLineInput() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }
    }

}
