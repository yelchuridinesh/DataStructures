package ConvertGivenIntegertoMaxInteger;

 class maxInteger {
     public int solution(int A){
         String s =Integer.toString(A);
         StringBuilder res = new StringBuilder();
         int left =0;
         int right = s.length()-1;

         while(left<=right){
             if(left ==right){
                 res.append(s.charAt(left));
             }
             else{
                 res.append(s.charAt(left));
                 res.append(s.charAt(right));
             }
             left++;
             right--;
         }
         return Integer.parseInt(String.valueOf(res));
     }
     public  static void main (String []args) {
         maxInteger ms = new maxInteger();
         int A = 130;
         System.out.println(ms.solution(A));
     }



 }

