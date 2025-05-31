package array.addtwonumbers;

public class AddTwoNumbersMain {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(2, new ListNode(3)), new ListNode(4)));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1.toString());
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
