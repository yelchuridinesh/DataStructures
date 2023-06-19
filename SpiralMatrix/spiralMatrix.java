package SpiralMatrix;
import java.util.*;

 class spiralMatrix {
     public List<Integer> spiralmatrix(int[][]matrix){
         List<Integer>spiral = new ArrayList<Integer>();
         int TopBoundary =0;
         int BottomBoundary =matrix.length-1;
         int LeftBoundary = 0;
         int rightBoundary =matrix[0].length-1;

         while(LeftBoundary <= rightBoundary && TopBoundary<=BottomBoundary){
             //This below condition is to traverse through the 0th Row of the n*n matrix
             for(int j=LeftBoundary; j<=rightBoundary; j++){
                 spiral.add(matrix[TopBoundary][j]);
             }
             TopBoundary++;

             //THis below condition is to traverse down from right most column of the matrix

             for(int i=TopBoundary; i<=BottomBoundary; i++){
                 spiral.add(matrix[i][rightBoundary]);
             }
             rightBoundary--;

             //Below condition is to traverse the Bottom row of the matrix from right

             if(TopBoundary<=BottomBoundary){
                 for(int i=rightBoundary; i>=LeftBoundary; i--){
                     spiral.add(matrix[BottomBoundary][i]);
                 }
             }
             BottomBoundary--;
             //Below condition is to traverse first row of the n*n matrix

             if(LeftBoundary<=rightBoundary){
                 for(int i=BottomBoundary; i>=TopBoundary; i--){
                     spiral.add(matrix[i][LeftBoundary]);
                 }
             }
             LeftBoundary++;
         }
         return spiral;

     }
     public static void main(String[]args){
         spiralMatrix sm = new spiralMatrix();
         int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
         System.out.println(sm.spiralmatrix(matrix));
     }

}
