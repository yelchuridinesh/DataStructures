package trappingRainWater;

//Intution -: we can solve this using Two pointers. By declaring left as 0 and right as height.length-1
//            Take extra two Variables maxLeft =height[left] and maxRight=height[right].
//            if maxLeft is smaller than maxRight we move the Left pointer by 1 and
//            update the maxLeft value as Math.min(maxLeft,height[left]) it means minimum value of current maxLeft and current element in the array
//            maxResult will be maxResult+(maxLeft or maxRight)-current element (height[left] or height[right])
//            Time complexity O(n) and space complexity O(1);

 class trappingRainwater {
     public int trap(int[]height){
         int left=0;
         int right=height.length-1;

         int maxLeft=height[left];
         int maxRight=height[right];
         int maxResult=0;

         while(left<right){

             if(maxLeft<=maxRight){
                 left++;
                 maxLeft=Math.max(maxLeft,height[left]);
                 maxResult+=maxLeft-height[left];
             }
             else{
                 right--;
                 maxRight=Math.max(maxRight,height[right]);
                 maxResult+=maxRight-height[right];
             }
         }
         return maxResult;

     }
     public static void main(String[]args){
         trappingRainwater tp = new trappingRainwater();
         int[]height={0,1,0,2,1,0,1,3,2,1,2,1};
         System.out.println(tp.trap(height));
     }
}
