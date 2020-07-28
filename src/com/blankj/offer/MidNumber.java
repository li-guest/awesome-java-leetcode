package com.blankj.offer;


/**
 * @Author: Edward Gavin
 * @Create: 2020-07-22 15:41
 */
public class MidNumber {
    //如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
    // 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
    // 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。

    public void insert(Integer num) {


    }

    public static Double getMedian(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int midium = nums.length >> 1;
        int index = partition(nums, left, right);
        while (index != midium) {
            if (index < midium) {
                left = index + 1;
                index = partition(nums, left, right);
            } else {
                right = index - 1;
                index = partition(nums, left, right);
            }
        }
        return (double)nums[midium];
    }

    private static int partition(int[] array, int start, int end) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (start > end) {
            return 0;
        }

        int base = array[start];
        while (start != end) {
            while (array[end] >= base && start < end) {
                end --;
            }
            while (array[start] <= base && start < end) {
                start ++;
            }
            if (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        array[start] = array[end];
        array[end] = base;
        return end;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7};
        double result = getMedian(test);
        System.out.println(result);
    }
}
