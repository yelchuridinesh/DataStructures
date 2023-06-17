package jumpGameTwo;

//This problem is similar to Jump game 1 . Here We declare 2 pointers Left and Right from the starting of the index.
//as long r<nums.length-1 where can Iterate between left pointer value and right pointer Value
// and get Max of (fur,  i+nums[i]) and store that value in Fur variable .

 class jumpGame2 {

     public int JumpGameII(int[]nums){
         int res =0, l=0, r=0, fur=0;

         while(r<nums.length-1){
             for(int i=l; i<=r; i++){
                 fur = Math.max(fur, i+nums[i]);
             }
             l=r+1;
             r=fur;
             res++;
         }
         return res;
     }
     public static void main (String[] args ){
         jumpGame2 jp2 = new jumpGame2();
         int[]nums = {2,3,1,1,4};
         System.out.println(jp2.JumpGameII(nums));
     }
}
