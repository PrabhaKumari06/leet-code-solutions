package leetcode.easy.top100;

public class MergeTwoSortedLists {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * }
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        if (list1 == null && list2 == null) return head;

        if (list1 == null) return list2;

        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            head = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            ListNode newNode = new ListNode();
            if (list1.val <= list2.val) {
                newNode.val = list1.val;
                list1 = list1.next;

            } else {
                newNode.val = list2.val;
                list2 = list2.next;
            }
            temp.next = newNode;
            temp = newNode;
        }
        while (list1 != null) {
            ListNode node = new ListNode(list1.val);
            temp.next = node;
            temp = node;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode node = new ListNode(list2.val);
            temp.next = node;
            temp = node;
            list2 = list2.next;
        }
        return head;
    }
}
