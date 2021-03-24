package com.company.DataStructure.basic.queue;

public class CustomCycleQueue {
    private Object[]  mDatas;
    private int tail=0; //队列尾
    private int head=0; //队列头
    private int length;


    public CustomCycleQueue(int size){
        mDatas=new Object[size];
        length=size;
    }


    /**数据不进行位移
     * 将指针移到当前等分值的下一位
     * @param value
     */
    public void add(Object value){
        if((tail+1)%length==head) return;
        mDatas[tail]=value;
        tail=(tail+1)%length;
    }

    /**数据不进行位移
     * 将指针移到当前等分值的下一位
     * @param
     */
    public Object remove(){
        if(tail==head) return null;
        Object currentData = mDatas[head];
        head=(head+1)%length;
        return currentData;
    }

    public void printAll(){
        for(int i=head;i<=tail;i++){
            System.out.println("i="+i+",打印出的数据为:"+mDatas[i]);
        }
    }

    public static void main(String[] arg0){
        CustomCycleQueue mCustomQueue = new CustomCycleQueue(5);
        mCustomQueue.add("111");
        mCustomQueue.add("222");
        mCustomQueue.add("333");
        mCustomQueue.add("444");

        mCustomQueue.printAll();
        System.out.println(mCustomQueue.remove());
        System.out.println(mCustomQueue.remove());
        System.out.println(mCustomQueue.remove());
        System.out.println(mCustomQueue.remove());
    }

}
