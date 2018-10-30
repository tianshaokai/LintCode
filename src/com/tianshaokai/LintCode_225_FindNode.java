package com.tianshaokai;

/**
 * 在链表中找值为 value 的节点，如果没有的话，返回空
 */
public class LintCode_225_FindNode {

    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode third = new ListNode(3);
        one.next = two;
        two.next = third;

        ListNode node = findNode(one, 4);

        System.out.println("执行结果：" + node == null ? null : node.value);
    }

    private static ListNode findNode(ListNode head, int value) {
        if (head == null) {
            return null;
        }
        int i = 0;
        while (head != null) {
            System.out.println("循环查找次数：" + i);
            if (head.value == value) {
                return head;
            }
            head = head.next;
            i ++;
        }
        return null;
    }
}
