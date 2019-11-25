package org.abyss.geektime.algol;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * merge-two-sorted-lists
 *
 * @date 2019-11-24
 */
public class Solution3 {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return val + (next == null ? "" : "->" + next);
		}
	}

	//	输入：1->2->4, 1->3->4
	//	输出：1->1->2->3->4->4
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}


	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(4);
		a1.next = a2;
		a2.next = a3;


		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(4);
		b1.next = b2;
		b2.next = b3;

		System.out.println("a1: " + a1);
		System.out.println("b1: " + b1);
		ListNode listNode = mergeTwoLists(a1, b1);
		System.out.println("merge: " + listNode);
	}


}
