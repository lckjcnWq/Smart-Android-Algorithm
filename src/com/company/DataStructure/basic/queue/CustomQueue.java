package com.company.DataStructure.basic.queue;

public class CustomQueue {
    private Object[]  mDatas;
    private int tail; //队列尾
    private int head; //队列头
    private int length;


    public CustomQueue(int size){
        mDatas=new Object[size];
        length=size;
        head=0;
    }


    public void add(Object value){
        if(tail==length) return;
        tail++;
        mDatas[tail]=value;
    }

    public Object remove(){
        if(tail==head) return null;
        Object currentData = mDatas[head];
        head++;
        return currentData;
    }

    public void printAll(){
        for(int i=head;i<=tail;i++){
            System.out.println("i="+i+",打印出的数据为:"+mDatas[i]);
        }
    }

    public static void main(String[] arg0){
        CustomQueue mCustomQueue = new CustomQueue(20);
        mCustomQueue.add("111");
        mCustomQueue.add("222");
        mCustomQueue.add("333");
        mCustomQueue.add("444");
        mCustomQueue.add("555");

        mCustomQueue.printAll();
        System.out.println(mCustomQueue.remove());
        System.out.println(mCustomQueue.remove());
        System.out.println(mCustomQueue.remove());
    }

}
