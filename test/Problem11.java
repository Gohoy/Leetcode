package test;

import org.junit.Test;

public class Problem11 {
    //定义一个无穷大的值
    static final int INF = Integer.MAX_VALUE;
    //定义顶点个数
    static final int V = 5;

    //定义一个函数，用于找到距离最小生成树最近的顶点
    int minKey(int key[], Boolean mstSet[])
    {
        //初始化最小值为无穷大
        int min = INF, min_index = -1;

        //遍历所有顶点，找到未加入最小生成树的顶点中距离最小的那个
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        //返回最小距离顶点的索引
        return min_index;
    }

    //定义一个函数，用于打印最小生成树的边和权值
    void printMST(int parent[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }


    //定义一个函数，用于实现Prim算法

    void primMST(int graph[][])
    {
        //创建一个数组，用于存储已加入最小生成树的顶点到其他顶点的距离
        int key[] = new int[V];

        //创建一个数组，用于存储已加入最小生成树的顶点对应的父节点（即连接该顶点的边）
        int parent[] = new int[V];

        //创建一个布尔数组，用于标记已加入最小生成树的顶点
        Boolean mstSet[] = new Boolean[V];

        //初始化所有键值为无穷大，所有标记为false
        for (int i = 0; i < V; i++) {
            key[i] = INF;
            mstSet[i] = false;
        }

        //从第0个顶点开始构造最小生成树，并将其键值设为0（即第一条边权值为0）
        key[0] = 0;

        //第0个节点作为整棵树的根节点（即没有父节点）
        parent[0] = -1;

        //循环V-1次，每次找到并加入一个未访问过且距离最近的顶点
        for (int count = 0; count < V - 1; count++) {
            //找到当前未访问过且距离最近的顶点u，并将其标记为已访问过
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            //更新u相邻且未访问过的所有顶点v到u的距离，并记录v对应u作为父节点（如果新距离比原来更短）
            for (int v = 0; v < V; v++)

                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        //打印出构造出来的最小生成树
        printMST(parent, graph);
    }
}
