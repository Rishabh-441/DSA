package KruskalsAlgorithmCode;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements  Comparable<Edge>
{
    int v1;
    int v2;
    int weight;

    public Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight-o.weight;
    }
}
public class KruskalAlgo {
    public static Edge[] kruskal(Edge edges[], int v)
    {
        Arrays.sort(edges);
        Edge mst[] = new Edge[v-1];
        int count=0;
        int i=0;
        int parent[] = new int[v];
        for (int j = 0; j <v ; j++) {
            parent[j] = j;
        }
        while(count != v-1)
        {
            Edge currentedge = edges[i++];
            int v1parent = findparent(currentedge.v1,parent);
            int v2parent = findparent(currentedge.v2, parent);
            if(v1parent != v2parent)
            {
                // including current edge
                mst[count]= currentedge;
                count++;
                parent[v1parent]= v2parent;
            }
        }
        return mst;
    }

    private static int findparent(int v1, int[] parent) {
        if(v1 == parent[v1])
        {
            return v1;
        }
        return findparent(parent[v1],parent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // how many vertex
        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        // how many edges
        System.out.println("Enter the number of edges:");
        int e = sc.nextInt();
        Edge edgearray[] = new Edge[e];

        for (int i = 0; i <e ; i++) {
            System.out.println("v1 v2 weight:");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            Edge obj = new Edge(v1,v2,weight);
            edgearray[i]= obj;
        }
        Edge[] mst = kruskal(edgearray,v);
        for (int i = 0; i <mst.length ; i++) {
            if(mst[i].v1<mst[i].v2)
            {
                System.out.println(mst[i].v1+" " +mst[i].v2+"  "+mst[i].weight);
            }
            else
            {
                System.out.println(mst[i].v2+" "+mst[i].v1+"  "+mst[i].weight);
            }
        }
    }
}