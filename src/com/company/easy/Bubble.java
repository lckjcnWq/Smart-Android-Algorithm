package com.company.easy;

public class Bubble {
    /** 冒泡排序算法核心思想:大小数据进行交换
     * @param numbers
     */
    public static  void   maopao_sort(int[] numbers){
        for(int i=0;i<numbers.length;i++){
          for(int j=0;j<numbers.length-1-i;j++){
              if(numbers[j]>numbers[j+1]){
                  int temp=numbers[j];
                  numbers[j]=numbers[j+1];
                  numbers[j+1]=temp;
              }
          }
        }
    }
}
