package MinimumTimeToMakeRopeColorful;

//leetcode 1578
 class minimumTimeToMakeColorful {
     public int minCost(String colors, int[]neededTime){
         int res=0, left=0;

         for(int right=1; right<neededTime.length; right++){
             if(colors.charAt(right) == colors.charAt(left)){
                 res+= Math.min(neededTime[left],neededTime[right]);
                 left = neededTime[left]<neededTime[right] ? right : left;
             }
             else{
                 left=right;
             }
         }
         return res;
     }
     public static void main(String[] args){
         minimumTimeToMakeColorful min = new minimumTimeToMakeColorful();
         String colors = "abaaac";
         int[]neededTime = {1,2,3,2,4,5};
         int res = min.minCost(colors, neededTime);
         System.out.println(res);
     }



}
