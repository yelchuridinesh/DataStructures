package WinningATicTacToeGame;

 class ticTacToe {
     public String tictactoe(int[][]moves){
         int[][] grid = new int[3][3];
         for(int i=0; i<moves.length; i++){
             int row= moves[i][0];
             int col = moves[i][1];

             if(i%2 ==0){
                 grid[row][col] =1;
                 if(checkWins(grid,row,col,1)){
                     return "A";
                 }
             }
             else{
                 grid[row][col] =-1;
                 if(checkWins(grid,row,col,-1)){
                     return "B";
                 }
             }
         }
         if(moves.length ==9) {
             return "Draw";
         }else{
             return "Pending";
         }
     }
     private boolean checkWins(int[][]grid , int row , int col, int player){
         if(grid[row][0] == player && grid[row][1] == player && grid[row][2] == player){
             return true;
         }
         if(grid[0][col] == player && grid[1][col] == player && grid[2][col] == player){
             return true;
         }
         if(grid[0][0] == player && grid[1][1] == player && grid[2][2] == player){
             return true;
         }
         if(grid[0][2] == player && grid[1][1] == player && grid[2][0] == player){
             return true;
         }
         return false;
     }
     public static void main (String[] args){
         ticTacToe tc = new ticTacToe();
         int[][]moves ={{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
         System.out.println(tc.tictactoe(moves));
     }

}
