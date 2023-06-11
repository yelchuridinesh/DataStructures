package productOfArray;
import java.util.*;

 class productofArrayItself {
    public int[] productExceptSelf(int[] nums) {

        int preFix = 1;
        int postFix =1;
        int[] res = new int[nums.length];
        res[0]=preFix;


        for(int i=0; i<nums.length-1; i++){

            preFix = nums[i] * preFix;
            //System.out.println(preFix);
            res[i+1]=preFix;
            
        } 
        res[nums.length-1]=res[nums.length-1] * postFix;

        for(int i=nums.length-1; i>0; i--) {

            postFix = nums[i]*postFix;
            //System.out.println("The value of postFix : "+ postFix);
            res[i-1] =postFix*res[i-1];

        }
        return res;
    }
    public static void main(String[]args) {
        productofArrayItself product = new productofArrayItself();
        int[]nums ={1,2,3,4};
        int[]res = product.productExceptSelf(nums);
        for(int result : res){
            System.out.println("The value of res is :"+ result);
        }    
    }
    
}
