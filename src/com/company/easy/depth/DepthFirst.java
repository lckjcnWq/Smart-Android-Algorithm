package com.company.easy.depth;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirst {
    public static void main(String[] args) {
        TreeNode head=new TreeNode(1);
        TreeNode second=new TreeNode(3);
        TreeNode three=new TreeNode(9);
        TreeNode four=new TreeNode(2);
        TreeNode five=new TreeNode(5);
        TreeNode six=new TreeNode(8);
        TreeNode seven=new TreeNode(7);
        head.rightNode=three;
        head.leftNode=second;
        second.rightNode=five;
        second.leftNode=four;
        three.rightNode=seven;
        three.leftNode=six;
        System.out.print("广度优先遍历结果：");
        new DepthFirst().BroadFirstSearch(head);
        System.out.println();
        System.out.print("深度优先遍历结果：");
        new DepthFirst().depthFirstSearch(head);
    }

    /**深度优先遍历核心思想:
     * 深度优先遍历，先遍历左边，后遍历右边,栈先进后出
     * @param nodeHead
     */
    public void depthFirstSearch(TreeNode nodeHead){
        if(nodeHead==null)  return;
        Stack<TreeNode> myStack = new Stack<>();
        myStack.add(nodeHead);
        while (!myStack.isEmpty()) {
            TreeNode node = myStack.pop();
            System.out.println("弹出元素："+node.data);
            if(node.rightNode!=null){
                myStack.push(node.rightNode);
            }
            if(node.leftNode!=null){
                myStack.push(node.leftNode);
            }
        }
    }


    /**广度优先遍历核心思想:
     * 深度优先遍历，先遍历左边，后遍历右边,栈先进后出
     * @param nodeHead
     */
    public void BroadFirstSearch(TreeNode nodeHead){
        if(nodeHead==null) return;
        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.add(nodeHead);
        while (!myQueue.isEmpty()) {
            TreeNode node = myQueue.poll();
            System.out.println("弹出元素："+node.data);
            if(null!=node.leftNode) {
                myQueue.add(node.leftNode);
            }
            if(null!=node.rightNode) {
                myQueue.add(node.rightNode);
            }
        }
    }
}
