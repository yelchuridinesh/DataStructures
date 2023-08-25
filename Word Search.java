//Intution -: it is very similar to Number of islands in the graph series the only difference is as there can be number of possible ways to match instead of marking the particular(row, column) to 1 we also unmark it if we dont find the string in a particular path. 
so that another path can use that grid for matching. 
that is the reason why I marked it as visited and if not found again unmarked it as 0 (back tracking); its a simple dfs algorithm with a visted array concept.
// https://leetcode.com/problems/word-search/description/

class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]= new int[m][n];

        // for(int i=0; i<m; i++){
        //     for (int j=0; j<n; j++){
        //         vis[i][j]=0;
        //     }
        // }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //vis[i][j]=1;
                if(check(board, word, i, j, m, n, vis, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board, String word, int i, int j, int m, int n, int[][] vis,  int curr){
        if(curr>=word.length()) return true;
        if(i<0 || j<0 || j>=n || i>=m || board[i][j] != word.charAt(curr) || vis[i][j]==1){
            return false;
        }
        boolean exist=false;
        if(board[i][j] == word.charAt(curr)){
            vis[i][j]=1;
            exist= check(board, word, i+1, j, m, n,vis, curr+1) || check(board, word, i, j-1, m, n , vis, curr+1 ) || check(board, word, i-1, j, m, n, vis, curr+1) || check(board, word, i, j+1, m, n, vis, curr+1);
            vis[i][j]=0;
        }
        return exist;
    }
}
