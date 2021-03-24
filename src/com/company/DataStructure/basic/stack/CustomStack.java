package com.company.DataStructure.basic.stack;

public class CustomStack {
    private   Object[]  mDatas;    //用数组实现
    private   int mLength;         //数组长度
    private   int mCount;          //元素个数

    public CustomStack(int length){
        mLength=length;
        mDatas=new Object[length];
        mCount=0;
    }

    public void push(Object value){
        if(mCount==mLength) return;
        mDatas[mCount]=value;
        mCount++;
    }

    public Object pop(){
        mCount--;
        return mDatas[mCount];
    }

    public void printAll(){
        for(int i=0;i<mCount;i++){
            System.out.println("i:"+i+" ,data:"+mDatas[i]);
        }
    }

    public static void main(String[] arg0){
        CustomStack temp = new CustomStack(11);
        temp.push("111");
        temp.push("222");
        temp.push("333");
        temp.push("444");
        temp.push("555");

        temp.printAll();

        System.out.println(temp.pop());
        System.out.println(temp.pop());
        System.out.println(temp.pop());
        System.out.println(temp.pop());
    }

}
