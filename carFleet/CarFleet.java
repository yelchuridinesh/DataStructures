package carFleet;

import java.util.Comparator;
import java.util.Stack;
import java.util.*;

class CarFleet {
     public int carfleet(int target, int[]position, int[]speed){
         Stack<Double> stack = new Stack<>();
         int [][] combine = new int[position.length][2];
         for(int i =0; i<position.length; i++){
             combine[i][0] = position[i];
             combine[i][1] = speed[i];
         }
         Arrays.sort(combine, Comparator.comparingInt(o ->o[0]));

         for(int i=combine.length-1; i>=0; i--){
             double currentTime = (double)(target - combine[i][0])/combine[i][1];
             if(!stack.isEmpty() && currentTime <=stack.peek()){
                 continue;
             }
             else{
                 stack.push(currentTime);
             }
         }
         return stack.size();
     }
     public static void main (String[] args){
         CarFleet cf = new CarFleet();
         int target =12;
         int[]position ={10, 8 , 0 ,5 ,3};
         int[]speed ={2,4,1,1,3};
         System.out.println(cf.carfleet(target,position,speed));
     }
}
