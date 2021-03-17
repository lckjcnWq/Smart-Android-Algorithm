package com.company.DataStructure.basic.array;

public class CustomArrayList {

    private int length;
    private Object[] array;

    public CustomArrayList(int size){
        array=new Object[size];
    }

    public void add(Object value){
        array[length++] = value;
    }

    public boolean isEmpty(){
        return length==0;
    }

     public boolean find(Object value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return true;
            }
        }
        return false;
     }

    /**移除思想：
     *  1.遍历找到移除的index
     *  2.然后index后的数据往前挪一个位置
     * @param value
     */
     public void remove(Object value){
         int index = 0;//用于记录移除的位置index
         for(int i=0;i<length;i++){
             if(array[i].equals(value)){
                 System.out.println("-------------------------我走了一次=");
                 index=i;
                 break;
             }
         }
         System.out.println("-------------------------index="+index);
         for(int j=index;j<length-1;j++){
             array[j]=array[j+1];
         }
         length--;
     }

    public void printArray(){
        if(!isEmpty()){
            for (int i=0;i<length;i++){
                System.out.println("循环的数据:"+i+" ,value="+array[i]);
            }
        }
    }
    public void printEmpty(){
        System.out.println("-------------------------");
    }
}
