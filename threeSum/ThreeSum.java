package threeSum;
import java.util.*;

 class ThreeSum {
     public List<List<Integer>> threesum(int[]nums){
          List<List<Integer>> result = new ArrayList<>();
          Arrays.sort(nums);

          for(int i =0; i<nums.length; i++){
             int a=nums[i];

             if(a>0){
                 break;
             }
             if(i>0 && a == nums[i-1]){
                 continue;
             }
             int left=i+1;
             int right=nums.length-1;

             while(left<right){
                 int threesummation = a+nums[left]+nums[right];

                 if(threesummation >0) right--;
                 else if (threesummation<0) left++;
                 else{
                     List<Integer> sol = new ArrayList<>();
                     sol.add(a);
                     sol.add(nums[left]);
                     sol.add(nums[right]);
                     result.add(sol);
                     left++;
                     right--;

                     while(left<right && nums[left] == nums[left-1]){
                         left++;
                     }
                 }

             }

          }
          return result;

     }
     public static void main(String[] args){
          ThreeSum ths = new ThreeSum();
          int[]nums= {-1,0,1,2,-1,-4};
          List<List<Integer>> result = ths.threesum(nums);
          System.out.println(result);
     }
}
