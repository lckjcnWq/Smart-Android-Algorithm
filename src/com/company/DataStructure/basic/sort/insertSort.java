package com.company.DataStructure.basic.sort;

import java.util.Random;

public class insertSort {
    public static void main(String[] arg0){
        int[]  arrays=new int[100000];
        for(int i=0;i<arrays.length;i++)
            arrays[i]= new Random().nextInt(10000);
//        int[] arrays=new int[]{1,54,24,12,14};
        long firstTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        sort(arrays);
        System.out.println("时间间隔:"+(System.currentTimeMillis()-firstTime));
//        printAll(arrays);
    }

    /**插入排序算法精髓：
     * 1.把空间分为已排序和未排序
     * 2.过程： 插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。
     * 重复这个过程，直到未排序区间中元素为空，算法结束
     * @param arr
     */
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){//未排序
            int value = arr[i];//未排序区间的首个元素
            int j=i-1;//已排序区间的尾下标
            for(;j>0;j--){
               if(value>arr[j]){
                   break;
               }else {
                   arr[j+1]=arr[j];
               }
            }
            arr[j+1]=value;
        }
    }

    private static void printAll(int[] data){
        for (int element:data) {
            System.out.println("数据:"+element);
        }
    }
}
