/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
  /**
   * @param {ListNode} head
   * @return {ListNode}
   */
  reverseList(head: ListNode | null): ListNode | null {
    let n: ListNode = new ListNode() // List to return
    let c: ListNode; // Current node

    if (head == undefined) {
      return head;
    }

    c = head;
    n.val = head.val

    while (c.next != undefined) {
      c = c.next;
      let appendNode = new ListNode(c.val);
      appendNode.next = n;
      n = appendNode;
    }

    return n;
  }
}
