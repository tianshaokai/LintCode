package com.tianshaokai;

/***
 * 找链表的中心点所对应的值。
 */
public class LintCode_228_MiddleNode {

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
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        one.next = two;
        two.next = third;
        third.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;

//        //只有一个节点时
//        ListNode one = new ListNode(1);

        ListNode node = middleNode(one);
        System.out.println("执行结果：" + node == null ? null : node.value);
    }

    private static ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        //定义一个快慢指针
        ListNode slow = head;
        ListNode fast = head.next;

        System.out.println("show: " + (slow == null ? null : slow.value) + " ,fast: " + (fast == null ? null : fast.value));
        int i = 0;
        while (fast != null && fast.next != null) {
            System.out.println("循环查找次数：" + i);
            slow = slow.next;
            fast = fast.next.next;
            System.out.println("show: " + (slow == null ? null : slow.value) + " ,fast: " + (fast == null ? null : fast.value));
            i ++;
        }
        return slow;
    }
}
