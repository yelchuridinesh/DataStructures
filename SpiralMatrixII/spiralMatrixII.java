package SpiralMatrixII;

 class spiralMatrixII {

     public int[][] generatematrix(int n){
         int matrix[][] = new int[n][n];
         int LeftBoundary =0;
         int RightBoundary = matrix[0].length-1;
         int TopBoundary =0;
         int BottomBoundary = matrix.length-1;
         int value =1;

         while(LeftBoundary<=RightBoundary && TopBoundary<=BottomBoundary){

             //for Filling First row in an N*n matrix

             for(int i=LeftBoundary; i<=RightBoundary; i++){
                 matrix[TopBoundary][i]=value++;
             }
             TopBoundary++;

             //For filling Last column in an N*N matrix

             for(int i=TopBoundary; i<=BottomBoundary; i++){
                 matrix[i][RightBoundary]=value++;
             }
             RightBoundary--;

             //for Filling Last row from Right to left

             for(int i=RightBoundary; i>=LeftBoundary; i--){
                 matrix[BottomBoundary][i]=value++;
             }
             BottomBoundary--;

             //For filling first column from Bottom to Top

             for(int i =BottomBoundary; i>=TopBoundary; i--){
                 matrix[i][LeftBoundary] = value++;
             }
             LeftBoundary++;

         }
         return matrix;

     }
     public static void main (String[] args){
         spiralMatrixII sm = new spiralMatrixII();
         int n = 3;
         int[][]res = sm.generatematrix(n);
         for(int [] row : res){
             for(int col : row) {
                 System.out.println(col + "");
             }
             System.out.println();
         }
     }

}
