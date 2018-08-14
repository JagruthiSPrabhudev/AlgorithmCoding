/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = null;
        ListNode temp = null;
        ListNode first = null;
        int carryover = 0;
        int sum = 0;
        //loop through the two linked lists
        while(null != l1 && null != l2){
            //calculate the sum starting from the least significant bit
            sum = carryover + (l1 != null ? l1.val:0)+(l2 != null ? l2.val:0);
            carryover = 0;
            // If the sum of two numbers is > 9 then set current digit and carryover digit
            if(sum > 9){
             temp = new ListNode(sum%10);
             carryover = sum/10;
            }else{
              temp = new ListNode(sum);
            }
           if(prev == null){
              prev = temp;
              first = temp;
            }
         else{
            prev = first;
            while(prev.next != null){
                prev = prev.next;
            }
              prev.next = temp;
          }
        if(carryover >0 && l1.next == null && l2.next == null){
            prev = first;
            while(prev.next != null){
                prev = prev.next;
            }
            prev.next = new ListNode(carryover);
        }
        else if(l2.next == null){
            l2.next = new ListNode(0);
        }
        else if(l1.next == null){
            l1.next = new ListNode(0);
        }
       sum = 0;
       l1 = l1.next;
       l2 = l2.next;
        
    }
        
        return first; 
    }
}
