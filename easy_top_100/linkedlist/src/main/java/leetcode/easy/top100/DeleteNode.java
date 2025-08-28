package leetcode.easy.top100;

public class DeleteNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public void deleteNode(ListNode node) {
        if(node == null) return;
        ListNode prev = null;
        while(node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;

    }
}
