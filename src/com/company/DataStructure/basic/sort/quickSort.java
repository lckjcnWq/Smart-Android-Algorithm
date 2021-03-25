package com.company.DataStructure.basic.sort;

import java.util.Random;

public class quickSort {

    public static void main(String[] arg0){

        int[]  arrays=new int[100000];
        for(int i=0;i<arrays.length;i++)
            arrays[i]= new Random().nextInt(100000);
//        int[] arrays={1,54,32,69,24,12,14};
        long firstTime = System.currentTimeMillis();
        quickSort(arrays,0,arrays.length-1);
        System.out.println("时间间隔:"+(System.currentTimeMillis()-firstTime));
//        printAll(arrays);
    }

    private static void printAll(int[] data){
        for (int element:data) {
            System.out.println("数据:"+element);
        }
    }

    /**快排：以分区点(分治思想)
     * 进行左排序和右排序(递归)
     * 终止条件：start>=end
     * @param arr
     * @param start
     * @param end
     */
    private static void quickSort(int[] arr,int start,int end){
        if(start>=end) return;
        int partition=partition(arr,start,end);
        quickSort(arr,start,partition-1);
        quickSort(arr,partition+1,end);
    }

    /**区分函数：获取区分点
     * 我们通过游标 i 把 A[p...r-1]分成两部分。A[p...i-1]的元素都是小于 pivot 的，我们暂且叫它“已处理区间”，A[i...r-1]是“未处理区间”。
     * 我们每次都从未处理的区间 A[i...r-1]中取一个元素 A[j]，
     * 与 pivot 对比，如果小于 pivot，则将其加入到已处理区间的尾部，也就是 A[i]的位置。
     * @param a
     * @param p
     * @param r
     * @return
     */
    private static int partition(int[] a, int p, int r) {
        int privot = a[r]; //最后作为分区点
        int i = p - 1;  //游标从p-1开始
        for (int j = p; j <= r - 1; j++) {
            if (a[j] <= privot) { //如果A[j]的值小于分区点，则将此值放入到已经分区数组A[i]尾端
                i = i + 1;  //每交换一次需要递增
                swap(a, i, j);
            }
        }

        swap(a, i + 1, r);
        return i + 1;

    }

    private static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
}
