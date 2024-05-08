package com.example02;

public class AddTwo {
    static int add = 0;
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode l1=null;
        ListNode  l2 = null;
        ListNode l3 = null;
        
      l3 =  addTwoNumbers(l1,l2);
        System.out.println(l3);
    }

   //   Definition for singly-linked list.
     


        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int num1 = l1!=null?l1.val:0;
            int num2 = l2!=null?l2.val:0;
            int num = (num1+num2+add)%10;
            add = num1+num2+add>=10?1:0;
            if ((l1!=null||l2!=null)||add!=0) {
                ListNode l = new ListNode(num);
                l.next = addTwoNumbers(l1!=null?l1.next:null,l2!=null?l2.next:null);
                return l;
            }
            return num==0?null:new ListNode(num);
        }
    }
