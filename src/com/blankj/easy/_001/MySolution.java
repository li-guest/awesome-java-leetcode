package com.blankj.easy._001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: Edward Gavin
 * @Create: 2020-01-05 17:14
 */
public class MySolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] test = {2,7,11,15};
        int target = 9;
        MySolution mySolution = new MySolution();
        int[] list = mySolution.twoSum(test, target);
        System.out.println(Arrays.toString(list));
    }
}
