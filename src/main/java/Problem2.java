public class Problem2 {

   public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);

        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentPosition = 1;
        
        while (currentPosition < position - 1 && current.next != null) {
            current = current.next;
            currentPosition++;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head = insert(head, 5, 3);
        printList(head);

        head = insert(head, 0, 1);
        printList(head);

        head = insert(head, 5, 10);
        printList(head);
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
