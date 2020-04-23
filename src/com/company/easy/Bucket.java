package com.company.easy;

public class Bucket {
    /**桶排序核心思想:将数据放在对应的索引上
     * @param nums
     * @param maxNum
     * @return
     */
    public static int[]  bucketSort(int[] nums,int maxNum){
        int[] sorted=new int[maxNum+1];
        for(int i=0;i<nums.length;i++){
            sorted[nums[i]]=nums[i];
        }
        return sorted;
    }
}
