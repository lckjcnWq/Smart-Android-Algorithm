package com.company.DataStructure.basic.tree;

import java.util.ArrayList;
import java.util.List;

public class leftFind {

    public static void main(String[] arg0){

        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(4);
        root.left = n1;
        root.right = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n6;

        List<Integer> rs1 = preOrderTraversal(root);
        System.out.println("递归前序遍历结果：" + rs1);
        List<Integer> rs2 = middleOrderTraversal(root);
        System.out.println("递归中序遍历结果：" + rs2);
        List<Integer> rs3 = preOrderTraversal(root);
        System.out.println("递归后序遍历结果：" + rs3);

    }

    // 前序遍历递归
    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        preHelper(root,pre);
        return pre;
    }

    public static void preHelper(TreeNode root, List<Integer> pre) {
        if(root==null) {
            return;
        }
        pre.add(root.data);
        preHelper(root.left,pre);
        preHelper(root.right,pre);
    }

    //中序遍历
    public static List<Integer> middleOrderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        middleHelper(root,pre);
        return pre;
    }

    private static void middleHelper(TreeNode root, List<Integer> pre) {
        if(root==null) {
            return;
        }
        preHelper(root.left,pre);
        pre.add(root.data);
        preHelper(root.right,pre);
    }

    //后续遍历
    public static List<Integer> afterOrderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        afterHelper(root,pre);
        return pre;
    }

    private static void afterHelper(TreeNode root, List<Integer> pre) {
        if(root==null) {
            return;
        }
        preHelper(root.left,pre);
        preHelper(root.right,pre);
        pre.add(root.data);
    }

}
