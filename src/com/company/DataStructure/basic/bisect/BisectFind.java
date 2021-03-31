package com.company.DataStructure.basic.bisect;

import java.util.Arrays;
import java.util.Random;

/**
 * 二分查找
 */
public class BisectFind {


    public static void main(String[] arg0){

        int[] arrays={1,54,32,69,24,12,14,154,1522,122,141,1120};
        Arrays.sort(arrays);
        long firstTime = System.currentTimeMillis();
        System.out.println("需要找到的次数:"+bisectFind(arrays,12));
//        System.out.println("需要找到的次数:"+f(20));
    }

    public static int f(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n-1) + f(n-2);
    }

    public static int bisectFind(int[] arr,int value){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int middle=(start+end)/2;
            if(arr[middle]<value){
                start=middle+1;
            }else if(arr[middle]>value){
                end=middle-1;
            }else {
                return middle;
            }
        }
        return -1;
    }

}
