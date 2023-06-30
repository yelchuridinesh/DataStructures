package Graphs;

import java.util.ArrayList;

class DepthFirstSearch {
     public static void depthforsearch(int node , boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>dfs){
         vis[node]=true;
         dfs.add(node);

         for(Integer value : adj.get(node)){
             if(vis[value] =false){
                 depthforsearch(node,vis,adj,dfs);
             }
         }
     }

     public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
         boolean vis[] = new boolean[V+1];
         vis[0]= true;
         ArrayList<Integer>dfs = new ArrayList<>();
         depthforsearch(0,vis,adj,dfs);
         return dfs;

     }
}
