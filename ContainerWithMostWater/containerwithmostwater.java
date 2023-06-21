package ContainerWithMostWater;

//Intution -: Two pointer , by declaring Left pointer at starting of the array and right pointer at end of an array


 class containerwithmostwater {

     public int maxArea(int[]height){
         int left=0;
         int right=height.length-1;
         int maxResult=0;

         while(left<right){
             int maxArea = (right-left)*Math.min(height[left],height[right]);
             maxResult=Math.max(maxResult,maxArea);

             if(height[left]<=height[right]){
                 left++;
             }
             else{
                 right--;
             }

         }
         return maxResult;

     }
     public static void main (String[]args){
         containerwithmostwater water = new containerwithmostwater();
         int[]height={1,8,6,2,5,4,8,3,7};
         System.out.println(water.maxArea(height));
     }
}
