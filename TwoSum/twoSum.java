package TwoSum;
import java.util.*;

 class twoSum {
     public int[] twosum(int[] numbers, int target){

         Map<Integer, Integer> hp = new HashMap<>();
         int[] result = new int[2];

         for (int i =0; i< numbers.length; i++){
             int c = target-numbers[i];

             if(hp.containsKey(c)){
                 result[0]=hp.get(c);
                 result[1] =i;
                 return result;
             }
             hp.put(numbers[i],i);
         }
         return result;

     }
     public static void main(String[] args){
         twoSum ts = new twoSum();
         int[]numbers ={2,7,11,15};
         int target =9;
         int[]res = ts.twosum(numbers,target);
         for(int results : res){
             System.out.println(results);
         }
     }
}
