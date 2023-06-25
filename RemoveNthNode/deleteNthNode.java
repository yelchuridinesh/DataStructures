package RemoveNthNode;



 class deleteNthNode {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteNode(ListNode head, int n){
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode first = temp;
        ListNode second = temp;

        while(n>0){
            second = second.next;
            n--;
        }

        while(second.next!=null){
            second=second.next;
            first=first.next;
        }
        first.next=first.next.next;
        return temp.next;
    }

    public static void main (String[]args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        int n=2;

        ListNode result=deleteNode(head,n);

        while(result!=null){
            System.out.println(result.val + "");
            result=result.next;
        }

    }


}
