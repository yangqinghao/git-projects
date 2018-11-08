package com.ztesoft.test;

import java.util.Arrays;

/**
 * @Author Created by yangqinghao
 * @Date 2018/9/27 9:17
 * @Version
 * @Description
 */
public class TestArrays {
    public static void main(String [] args){
           int [] i = {1,2,3,6,7,83,23,12,332};
           for(int start = 0,end = i.length-1;start < end;start++,end--){
                 swap(i,start,end);
           }
           System.out.println(Arrays.toString(i));
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
