package ImplementationOfLinkedList;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data){

        Node new_node = new Node(data);
        new_node.next=null;

        if(list.head == null ){
            list.head = new_node;
        }
        else{
            Node last = list.head;

            while(last.next!=null){

                last = last.next;
            }
            last.next = new_node;
        }
        return list;

    }
    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }

        System.out.println();
    }

    //Deletion of a key

    public static LinkedList deleteKey(LinkedList list, int key){
        Node curr_node = list.head;
        Node prev=null;

        //1st case if the element we need to remove is at head then

        if(curr_node != null && curr_node.data == key){
            list.head= curr_node.next;
            return list;

        }

        //Case 2 if element is present in the middle of the LinkedList

        while (curr_node != null && curr_node.data != key){
            prev=curr_node;
            curr_node = curr_node.next;

            if(curr_node != null){

                prev.next= curr_node.next;
                System.out.println(key + " found and deleted");
            }

            if(curr_node  == null){
                System.out.println(key + "Not Found");

            }

        }
        return list;


    }
    public static void main (String[] args){

        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);

        printList(list);

        deleteKey(list, 3);

        printList(list);

    }
}

