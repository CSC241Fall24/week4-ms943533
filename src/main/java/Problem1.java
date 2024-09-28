public class Problem1 {

    public static ListNode concatenate(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        ListNode y = l1;
        while (y.next != null) {
            y = y.next;
        }
        ListNode l2Copy = new ListNode(l2.val);
        ListNode newTail = l2Copy;
        ListNode temp = l2.next;

        while (temp != null) {
            newTail.next = new ListNode(temp.val);
            newTail = newTail.next;
            temp = temp.next;
        }
        y.next = l2Copy; 
        return l1;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(1);
        l1.next = second;
        second.next = third;

        ListNode l2 = new ListNode(4);
        ListNode num_2 = new ListNode(5);
        l2.next = num_2;

        ListNode result_list = concatenate(l1, l2);

        printList(result_list);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
