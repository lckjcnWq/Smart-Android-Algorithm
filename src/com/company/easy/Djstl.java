package com.company.easy;

public class Djstl {
    public static  void main(String[] args){
        int MAX = 10000;
        int[][] weight = {
                {0,3,2000,7,MAX},
                {3,0,4,2,MAX},
                {MAX,4,0,5,4},
                {7,2,5,0,6},
                {MAX,MAX,4,6,0}
        };
        int start = 0;
        Dijsktra(weight,start);
    }


    /**2、Dijkstra算法的精髓：
     * 1、令G = （V，E）为一个带权无向图。G中若有两个相邻的节点,i和j。aij(在这及其后面都表示为下标，请注意)为节点i到节点j的权值，在本算法可以理解为距离。每个节点都有一个值di(节点标记)表示其从起点到它的某条路的距离。
     *
     * 　　2、算法初始有一个数组V用于储存未访问节点的列表，我们暂称为候选列表。选定节点1为起始节点。开始时，节点1的d1=0, 其他节点di=无穷大，V为所有节点。
     * 初始化条件后，然后开始迭代算法，直到V为空集时停止。具体迭代步骤如下：
     *
     * 　　 将d值最小的节点di从候选列表中移除。(本例中V的数据结构采用的是优先队列实现最小值出列，最好使用斐波那契对，在以前文章有过介绍，性能有大幅提示)。对于以该节点为起点的每一条边，不包括移除V的节点, (i, j)属于A， 若dj > di + aij（违反松弛条件）,则令
     * 　　dj = di + aij    , （如果j已经从V中移除过，说明其最小距离已经计算出，不参与此次计算）
     * 　　可以看到在算法的运算工程中，节点的d值是单调不增的
     * @return
     */
    public static int[] Dijsktra(int[][]weight,int start){
        int length = weight.length;
        int[] shortPath = new int[length];//存放从start到各个点的最短距离
        shortPath[0] = 0;//start到他本身的距离最短为0
        String path[] = new String[length];//存放从start点到各点的最短路径的字符串表示
        for(int i=0;i<length;i++){
            path[i] = start+"->"+i;
        }
        int visited[] = new int[length];//标记当前该顶点的最短路径是否已经求出，1表示已经求出
        visited[0] = 1;//start点的最短距离已经求出
        for(int count = 1;count<length;count++){
            int k=-1;
            int dmin = Integer.MAX_VALUE;
            for(int i=0;i<length;i++){
                if(visited[i]==0 && weight[start][i]<dmin){
                    dmin = weight[start][i];
                    k=i;
                }
            }
            //选出一个距离start最近的未标记的顶点     将新选出的顶点标记为以求出最短路径，且到start的最短路径为dmin。
            shortPath[k] = dmin;
            visited[k] = 1;
            //以k为中间点，修正从start到未访问各点的距离
            for(int i=0;i<length;i++){
                if(visited[i]==0 && weight[start][k]+weight[k][i]<weight[start][i]){
                    weight[start][i] = weight[start][k]+weight[k][i];
                    path[i] = path[k]+"->"+i;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]+"="+shortPath[i]);
        }
        return shortPath;

    }
}
