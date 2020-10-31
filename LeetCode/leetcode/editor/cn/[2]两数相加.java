//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 5137 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1，遍历链表，保存在可变字符串中
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (l1 != null){
            sb1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            sb2.append(l2.val);
            l2 = l2.next;
        }
        // 2，对字符串进行逆序
        sb1.reverse();
        sb2.reverse();
        // 3，字符串转数字
        // 4，计算结果
        int sum = Integer.parseInt(sb1) + Integer.parseInt(sb2);
        StringBuilder s = new StringBuilder(String.valueOf(sum));
        s.reverse();
        // 5，转化为链表
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            ListNode tmp = new ListNode(t);
            cur.next = tmp;
            cur = cur.next;
        }
        return head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
