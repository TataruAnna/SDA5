import java.util.LinkedList;

public class MergeSortedLinkedLists {

    //1->2->4
    //1->3->4
    //1->1->2->3->4->4

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node (1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);
        list2.next.next.next = new Node(5);
        list2.next.next.next.next = new Node(6);
        printLinkedList(mergeLinkedLists(list1,list2));


    }

    public static void printLinkedList(Node head){
        Node current = head;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static Node mergeLinkedLists(Node l1, Node l2){


        Node head = new Node(0);
        Node merged = head;


        while (l1 !=null && l2 !=null){
            if (l1.val <= l2.val){
                merged.next = l1;
                l1 = l1.next;
            } else {
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }
        if (l1 != null){
            merged.next = l1;
        } else{
            merged.next = l2;
        }


        return head.next;

    }
}
