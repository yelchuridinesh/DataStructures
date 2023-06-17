package JumpGame;

//Uses GreedyAlgorithm approach by starting a Flag from the end of an Array.
// if the previous element from the flag can make a jump to reach Flag then reduce the Flag counter to one step Back.
//as long as we reach the Flag from previous element we reduce the Flag.
// after traversing through elements if greedyFlag becomes 0 then we return true else False

 class jumpGame {

     public boolean noOfJumps(int[]nums){
         int greedyFlag=nums.length-1;

         for(int i=nums.length-2; i>=0; i--){
             if(nums[i]+i >=greedyFlag){
                 greedyFlag =i;
             }
         }
         return greedyFlag ==0;
     }

     public static void main(String[] args ){
         jumpGame nj= new jumpGame();
         int[]nums={2,3,1,1,4};
         System.out.println(nj.noOfJumps(nums));
     }

}
