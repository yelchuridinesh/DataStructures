package maximumConsecutiveSequence;
import java.util.*;

 class maximumConsecSequence {
    public  int longestConsecutive(int[] nums){

        HashSet<Integer> longestSet = new HashSet<Integer>();
        int ans =0;
        for(int num : nums){
            longestSet.add(num);
        }
        for(int elements : nums){
            int prevElement = elements-1;
            int nextElement = elements+1;
            if(!longestSet.contains(prevElement)){
                int count =1;
                while(longestSet.contains(nextElement)){
                    nextElement++;
                    count++;
                }
                ans =Math.max(count,ans);
            }
        }
        return ans;

    } 
    public static void main(String[]args){
        maximumConsecSequence ms = new maximumConsecSequence();
        int[]nums ={100,4,200,1,3,2};
        int ans = ms.longestConsecutive(nums);
        System.out.println(ans);

    }
    
}
