package leetcode.editor.cn.week01;
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 2038 👎 0

public class 合并两个有序链表{
	public static void main(String[] args) {
		Solution solution = new 合并两个有序链表().new Solution();
	}



class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newNode = new ListNode(0);
		ListNode curNode = newNode;
		// 1 2
		// 1 3 4
		while (l1 != null || l2 !=null) {
			// l2节点为空或者2个都不为空且l1<=l2
			if (l2 == null || (l1 != null && l1.val <=l2.val)){
				curNode.next = l1;
				curNode = curNode.next;
				l1 = l1.next;

			}else{
				curNode.next = l2;
				curNode = curNode.next;
				l2 = l2.next;
			}
		}
		return newNode.next;
    }
}
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
