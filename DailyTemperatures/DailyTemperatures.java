package DailyTemperatures;

import java.util.Stack;

class DailyTemperatures {
     public int[] dailyTemperatures(int[] temp){
         Stack<Integer> stack = new Stack<>();
         int[] ans =new int[temp.length];

         for(int currDay=0; currDay<temp.length; currDay++){
             while(!stack.isEmpty() && temp[currDay]> temp[stack.peek()]){
                 int prevDay =stack.pop();
                 ans[prevDay] = currDay-prevDay;
             }
             stack.add(currDay);
         }
         return ans;
     }
     public static void main(String[] args ){
         DailyTemperatures dt = new DailyTemperatures();
         int[]temp ={73,74,75,71,69,72,76,73};
         int []ans = dt.dailyTemperatures(temp);
         for(int answer : ans){
             System.out.println(answer);
         }
     }

}
