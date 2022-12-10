/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
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
        if(l1==null&&l2==null) return new ListNode();
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode res=new ListNode();
        ListNode pr=res;
        int flag=0;
        while(p1!=null||p2!=null){
            int val1=p1==null?0:p1.val;
            int val2=p2==null?0:p2.val;
            int val=val1+val2+flag;
            flag=val/10;
            val=val%10;
            pr.next=new ListNode(val);
            pr=pr.next;
            if(p1!=null) p1=p1.next;
            if(p2!=null) p2=p2.next;
        }
        if(flag!=0){
            pr.next=new ListNode(flag);
        }
        return res.next;
    }
}
// @lc code=end

