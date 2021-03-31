package com.company.DataStructure.basic.array;

/**
 * 稀疏数组
 * 核心思想:
 * 1.记录数组一共有几行几列，有多少个不同的值
 * 2.把具有不同值的元素的行列及值记录在一个小规模的数组中，从而缩小程序的规模
 *
 * */

public class SpareArray {
    public static void main(String[] arg0){
        //稀疏数组

        //1.将数据存到原始二位数组中
        int[][] srcArrays=new int[11][11];
        srcArrays[1][2]=1;
        srcArrays[2][3]=2;
        srcArrays[3][4]=2;

        int sum=0; //定义数组的大小

        for(int i=0;i<srcArrays.length;i++){
            for(int j=0;j<srcArrays.length;j++){
                System.out.printf("%d\t",srcArrays[i][j]);
                if(srcArrays[i][j]!=0) sum++;
            }
            System.out.println();
        }

        System.out.println("sum个数："+sum);
        System.out.println("srcArrays.length长度："+srcArrays.length);
        //2.建立稀疏数组并存入第一行数组 行数 列数 并且赋值对应
        int[][] spareArrays=new int[sum+1][3];
        spareArrays[0][0]=srcArrays.length;
        spareArrays[0][1]=srcArrays.length;
        spareArrays[0][2]=sum;


        //3.将原始二位数组中的数据转成稀疏数组
        int count = 0;//用于记录第几个非零数据
        for(int i=0;i<srcArrays.length;i++){
            for(int j=0;j<srcArrays.length;j++){
                if(srcArrays[i][j]!=0){
                    count++;
                    spareArrays[count][0]=i;
                    spareArrays[count][1]=j;
                    spareArrays[count][2]=srcArrays[i][j];
                }
            }
        }
        System.out.println("得到稀疏数组为~~~~");
        for (int i = 0; i < spareArrays.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", spareArrays[i][0], spareArrays[i][1], spareArrays[i][2]);
        }
    }
}
