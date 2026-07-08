package jul8_2026;

//import jul8_2026.add2Num.ListNode;

public class deleteNthNode {
    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    //func to delete nth node from end
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;
        //move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        //move both pointers together
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //delete the node
        slow.next = slow.next.next;
        return dummy.next;
    }

    // Function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args) {
        //ll: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        deleteNthNode obj = new deleteNthNode();
        System.out.println("Original List:");
        printList(head);

        head = obj.removeNthFromEnd(head, n);

        System.out.println("After Deleting " + n + "th Node From End:");
        printList(head);
    }
}

