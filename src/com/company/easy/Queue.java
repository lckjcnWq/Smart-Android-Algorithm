package com.company.easy;

public class Queue {
    public static void pop(int[] arr,int head,int tail){
        if(head>tail) return;
        while (head<tail){
            //对首出队
            head++;
            //对尾赋值并且插入
            arr[tail]=arr[head];
            tail++;
            //对首再次出队
            head++;
        }
    }
}
