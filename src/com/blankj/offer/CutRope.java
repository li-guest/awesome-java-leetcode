package com.blankj.offer;
/**
 * @Author: Edward Gavin
 * @Create: 2020-08-02 08:08
 */
public class CutRope {
    public int cutRope(int length){
        if (length<2){
            return 0;
        }
        if (length == 2){
            return 1;
        }
        if (length == 3){
            return 2;
        }

        int cutTimesOfThree = length / 3;
        if (length - cutTimesOfThree*3 == 1){
            cutTimesOfThree -= 1;
        }

        int cutTimesOfTwo = (length - cutTimesOfThree*3) /2;

        return (int)(Math.pow(3, cutTimesOfThree) * Math.pow(2, cutTimesOfTwo));
    }

    public static void main(String[] args){

    }
}
