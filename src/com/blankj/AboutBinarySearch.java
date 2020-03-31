package com.blankj;

/**
 * @Author: Edward Gavin
 * @Create: 2020-03-30 16:06
 */
public class AboutBinarySearch {
    public int baseBinarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length;
        int mid = 0;

        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid + 1;
            else if (nums[mid] < target)
                low = mid - 1;
        }
        return -1;
    }
    public int searchLeft(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while (low <= high){
            mid = (low+high) /2;
            if (nums[mid] == target){
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }
        }
        return low;
    }

    public int searchRight(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high){
            mid = (low+high) / 2;
            if (nums[mid] == target){
                low = mid + 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] search = {1,2,3,4,4,4,5,6,7,8};
        AboutBinarySearch aboutBinarySearch = new AboutBinarySearch();
        int index = aboutBinarySearch.baseBinarySearch(search, 4);
        int searchLeft = aboutBinarySearch.searchLeft(search, 4);
        int searchRight = aboutBinarySearch.searchRight(search, 4);


        System.out.println(searchLeft);
        System.out.println(searchRight);
        System.out.println(index);
    }
}
