public class Problem1 {
   public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
      ListNode y = l1;
      while(y.next != null){
         y = y.next;
      }
      y.next = l2;
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
