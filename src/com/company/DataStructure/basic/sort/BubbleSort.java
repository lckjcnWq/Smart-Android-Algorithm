package com.company.DataStructure.basic.sort;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] arg0){
//        int[]  arrays=new int[50000];
//        for(int i=0;i<arrays.length;i++){
//            arrays[i]= new Random().nextInt(10000);
//        }
//        long firstTime = System.currentTimeMillis();
//        System.out.println(System.currentTimeMillis());
//        sort(arrays);


    }


    private static void sort(int[] data){
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-1;j++){
                if(data[j+1]<data[j]){
                    //第二个数比第一个小，则进行交换
                    int temp;
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
    }

    private static void printAll(int[] data){
        for (int element:data) {
            System.out.println("数据:"+element);
        }
    }

}
