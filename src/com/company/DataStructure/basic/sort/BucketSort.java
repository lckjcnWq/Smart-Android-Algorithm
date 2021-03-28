package com.company.DataStructure.basic.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BucketSort {

    public static void main(String[] arg0){
        int[]  arrays=new int[500];
        for(int i=0;i<arrays.length;i++){
            arrays[i]= new Random().nextInt(500);
        }
        long firstTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        bucketSort(arrays);
        System.out.println("时间间隔:"+(System.currentTimeMillis()-firstTime));
    }

    /**桶排序的基本思想是：把数组 arr 划分为n个大小相同子区间（桶），每个子区间各自排序，最后合并。
     计数排序是桶排序的一种特殊情况，可以把计数排序当成每个桶里只有一个元素的情况。

     1.找出待排序数组中的最大值max、最小值min
     2.我们使用 动态数组ArrayList 作为桶，桶里放的元素也用 ArrayList 存储。桶的数量为(max-min)/arr.length+1
     3.遍历数组 arr，计算每个元素 arr[i] 放的桶
     4.每个桶各自排序
     5.遍历桶数组，把排序好的元素放进输出数组
     * @param arr
     */
    private static void bucketSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        //桶数
        int bucketNum = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }

        //将每个元素放入桶
        for(int i = 0; i < arr.length; i++){
            int num = (arr[i] - min) / (arr.length);
            bucketArr.get(num).add(arr[i]);
        }

        //对每个桶进行排序
        for(int i = 0; i < bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }

        System.out.println(bucketArr.toString());
    }


    private static void printAll(int[] data){
        for (int element:data) {
            System.out.println("数据:"+element);
        }
    }

}
