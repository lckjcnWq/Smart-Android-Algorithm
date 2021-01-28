package com.company.DataStructure;

public class Arrayqueue {
    private int[]  mArray;
    private int mCount;


    public Arrayqueue(int size){
        mArray=new int[size];
        mCount=0;
    }

    public void add(int value){
        mArray[mCount++]=value;
    }

    public int front(){
        return mArray[0];
    }

    public boolean isEmpty(){
        return mCount==0;
    }


    // 返回“栈顶元素值”，并删除“栈顶元素”
    public int pop() {
        int ret = mArray[0];
        mCount--;
        for (int i=1; i<=mCount; i++)
            mArray[i-1] = mArray[i];
        return ret;
    }

    public int size(){
        return mCount;
    }


    public static void main(String[] args) {
        int tmp=0;
        Arrayqueue astack = new Arrayqueue(12);

        // 将10, 20, 30 依次推入栈中
        astack.add(10);
        astack.add(20);
        astack.add(30);

        // 将“栈顶元素”赋值给tmp，并删除“栈顶元素”
        tmp = astack.pop();
        System.out.printf("tmp=%d\n", tmp);

        // 只将“栈顶”赋值给tmp，不删除该元素.
        tmp = astack.front();
        System.out.printf("tmp=%d\n", tmp);

        astack.add(40);

        System.out.printf("isEmpty()=%b\n", astack.isEmpty());
        System.out.printf("size()=%d\n", astack.size());
        while (!astack.isEmpty()) {
            System.out.printf("size()=%d\n", astack.pop());
        }
    }
}
