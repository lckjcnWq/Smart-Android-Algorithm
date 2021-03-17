package com.company.DataStructure.basic.array;

public class CustomArrayListTest {
    public static void main(String[] arg0){
        CustomArrayList mArraySample = new CustomArrayList(8);
        mArraySample.add(100);
        mArraySample.add(300);
        mArraySample.add(200);
        mArraySample.add(400);
        mArraySample.add(500);
        mArraySample.printArray();
        mArraySample.printEmpty();
        mArraySample.remove(400);
        mArraySample.printArray();
    }
}
