package com.company;

import com.company.easy.Bucket;
import com.company.easy.Queue;
import com.company.utils.CommonUtils;
import com.company.easy.FastSort;

public class Test {

    public static void main(String[] args) {
        int[] numbers=new int[10];
        numbers[0]=6;
        numbers[1]=3;
        numbers[2]=1;
        numbers[3]=7;
        numbers[4]=5;
        numbers[5]=8;
        numbers[6]=9;
        numbers[7]=2;
        numbers[8]=4;
//      FastSort.quirtSort(numbers,0,numbers.length-1);
//        Queue.pop(numbers,1,10);
        int[] sorts = Bucket.bucketSort(numbers, 9);
        CommonUtils.printSum(sorts);
    }
}


