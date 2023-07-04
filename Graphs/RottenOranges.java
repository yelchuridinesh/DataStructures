package Graphs;

import java.util.LinkedList;
import java.util.*;

//Intution -: we Have determine the Minimum Number of time taken to rotten all the fresh Oranges. so it means if a given a input Has 2 rotten
// Oranges we need to Rotten its neighbours/FreshOranges Simultaneously then only we can get the Minimum Time .
// so We BFS as its traverse the elements Level wise. We declare a Queue of Type Pair . add all the RottenTomatoes to the queue in the initial given Array. we add an extra element to the queue called tm to
// track the time taken to rot the corresponding fresh Mangoes.

class Pair{
    int first;
    int second;
    int tm;

    Pair(int first, int second,int tm){
        this.first=first;
        this.second=second;
        this.tm=tm;
    }
}

 class RottenOranges {
     public int rottenOranges(int[][] grid){

         int n=grid.length;
         int m=grid[0].length;

         int[][]vis = new int[n][m];
         Queue<Pair> q = new LinkedList<>();
         int cntFresh=0;


         for(int i=0; i<n; i++){
             for(int j=0; j<m; j++){
                 if(grid[i][j] ==2){
                     q.add(new Pair(i, j ,0));
                     vis[i][j]=2;
                 }
                 else{
                     vis[i][j]=0;
                 }

                 if(grid[i][j] ==1){
                     cntFresh++;
                 }
             }
         }

         int tm=0;
         int[]delrow={-1,0,+1,0};
         int[]delcol={0,1,0,-1};
         int cnt=0;

         while(!q.isEmpty()){
             int ro=q.peek().first;
             int co=q.peek().second;
             int t=q.peek().tm;
             tm=Math.max(tm,t);
             q.remove();

             for(int i=0; i<4; i++){
                 int nrow=ro+delrow[i];
                 int ncol=co+delcol[i];

                 if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol] ==1 && vis[nrow][ncol] ==0){
                     q.add(new Pair(nrow,ncol,t+1));
                     vis[nrow][ncol]=2;
                     cnt++;
                 }
             }
         }

         if(cnt!=cntFresh) return -1;
         return tm;


     }

     public static void main(String [] args){
         int[][] grid =  {{2,1,1},{1,1,0},{0,1,1}};
         RottenOranges ro = new RottenOranges();
         int ans = ro.rottenOranges(grid);
         System.out.println(ans);
     }

}
