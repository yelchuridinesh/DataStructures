package AddTwoNumbers;

import java.util.*;

class addtwonumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

     public static ListNode addnumbers(ListNode l1, ListNode l2){
        ListNode dummy= new ListNode();
        ListNode current=dummy;
        int carry=0;
        int v1;
        int v2;
        while(l1!=null || l2!=null ||carry!=0){
            if(l1!=null){
                 v1=l1.val;
                 System.out.println("The v1 is :"+ v1);
            }
            else  {
                v1=0;
            }

            if(l2!=null){
                 v2=l2.val;
                System.out.println("The v2 is :"+ v2);
            }
            else {
                 v2=0;
            }

            int value = v1 + v2 + carry;
            System.out.println("the value is :" + value);
            carry=(value)/10;
            value=(value)%10;
            current.next=new ListNode(value);

            // Incrementing the pointers....

            current=current.next;

            if (l1!=null){
                System.out.println("inside if");
                l1=l1.next;
                //System.out.println(l1.val);
            }
            if (l2!=null){
                l2=l2.next;
            }

        }
        return dummy.next;

     }

     public static void main (String[] args){
        ListNode l1=new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next=new ListNode(3);

         ListNode l2=new ListNode(5);
         l2.next  = new ListNode(6);
         l2.next.next=new ListNode(4);

        ListNode result = addnumbers(l1,l2);

        while(result!=null){
            System.out.println(result.val + "");
            result=result.next;
        }


     }



     }


