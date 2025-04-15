/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // 다음 노드 저장
            curr.next = prev;          // 방향 뒤집기
            prev = curr;               // prev 앞으로 전진
            curr = next;               // curr 앞으로 전진
        }

        return prev; // prev는 새로운 head
    }
}