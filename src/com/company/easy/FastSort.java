package com.company.easy;

public class FastSort {

    /**快排核心思想(nlogN):以最左边作为基点,左右数据进行交换
     * @param numbers
     * @param left
     * @param right
     */
    public  static  void  quirtSort(int[] numbers,int left ,int right){
        if(left>right) return;
        int i,j,temp;
        temp=numbers[left];//左边基准点
        i=left;
        j=right;
        while (i!=j){
            while (temp<=numbers[j] && i<j)
                j--;
            while (temp>=numbers[i] && i<j)
                i++;
            if(i<j){
               int t=numbers[i];
               numbers[i]=numbers[j];
               numbers[j]=t;
            }
        }
        numbers[left]=numbers[i];
        numbers[i]=temp;
        quirtSort(numbers,left,i-1);
        quirtSort(numbers,i+1,right);
    }
}
