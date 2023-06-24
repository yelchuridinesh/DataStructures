package mergeLists;

 class mergeTwoLists {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public static ListNode mergetwolists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode current = dummy;

        while(current1!=null && current2!=null){
            if(current1.val <current2.val){
                current.next = current1;
                //System.out.println(current1.val);
                current1=current1.next;
                //System.out.println("THe value of: " + current1.val);
            }
            else{
                current.next=current2;
                current2=current2.next;
            }
            current = current.next;

            if(current1!=null){
                current.next=current1;
            }
            if(current2!=null){
                current.next=current2;
            }
        }
        return dummy.next;
 }
 public static void main (String[] args){
        //mergeTwoLists ml =new mergeTwoLists();
       ListNode list1 = new ListNode(1);
       list1.next = new ListNode(2);
       list1.next.next = new ListNode(4);

     ListNode list2 = new ListNode(1);
     list2.next = new ListNode(3);
     list2.next.next = new ListNode(4);

     ListNode mergedlist= mergetwolists(list1,list2);

     ListNode curr = mergedlist;

     while(curr!=null){
         System.out.print(curr.val + " ");
         curr = curr.next;
     }

 }

}
