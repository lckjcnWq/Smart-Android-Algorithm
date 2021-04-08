package com.company.DataStructure.basic.tree;

public class TrieTree {
    public static void main(String[] arg0){
       String a="hellofivenfinefosihao";
       insert(a.toCharArray());
       System.out.println("是否找到:"+find("fine".toCharArray()));
    }


    private static TrieNode root = new TrieNode('/'); // 存储无意义字符
    /**一个个挪位插入数据构成Trie数
     * @param data
     */
    public static void insert(char[] data){
        TrieNode p=root;
        for(int i=0;i<data.length;i++){
            int index=data[i]-'a';
            if(p.children[index]==null){
                TrieNode newNode = new TrieNode(data[i]);
                p.children[index]=newNode;
            }
            p=p.children[index];
        }
        p.isEndingChar=true;
    }

    /**一个个挪位找
     * @param pattern
     * @return
     */
    public static boolean find(char[] pattern){
        TrieNode p = root;
        for (int i = 0; i < pattern.length; ++i) {
            int index = pattern[i] - 'a';
            if (p.children[index] == null) {
                return false;
            }
            p=p.children[index];
        }
        return p.isEndingChar;
    }
}
