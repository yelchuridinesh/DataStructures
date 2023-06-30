package Graphs;

//Breadth First Search of a undirected graph
//Space complexity -; O(3N) --> o(n) ,
// Time complexity ---> O(n) + O(2E)  here 2E refers to total degree like total degree is defined as
// twice the no of edges

import java.util.*;
import java.io.*;
import java.lang.*;
 class BreadthFirstSearch {
     public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){

         ArrayList<Integer> bfs = new ArrayList<>();
         boolean vis[] = new boolean[V];
         Queue<Integer> q = new LinkedList<>();
         q.add(0); //if it is Zero Indexed and 1 if it is 1 indexed
         vis[0] = true; // it is nothing but setting 0th index as true and remaining indexes are False. which means we have visiting Node 0

         while(!q.isEmpty()){
             int node = q.poll();
             bfs.add(node);

             for(Integer value : adj.get(node)){
                 if(vis[node] == false){
                     vis[node] = true;
                     q.add(value);
                 }
             }
         }
         return bfs;
     }


    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            BreadthFirstSearch obj = new BreadthFirstSearch();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }

}



