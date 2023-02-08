// 2. Add Two Numbers
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Example 1:
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

// Example 2:
// Input: l1 = [0], l2 = [0]
// Output: [0]

// Example 3:
// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]
 

// Constraints:
// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading zeros.

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

// Solution: Here we are looping through both the lists. Then checking if the list 1 is empty or not if not empty get the first value in var A and same for list 2 then 
// calculating the sum adding carry to sum at start it will add Zero(0) after that calculating the carry if carry not equal to 0 then we can go ahead if there is carry
// then taking the mod (if the sum is like 12 mod will give us 2) then we are assigning sum to mod value and then adding this value in the node in this way we are creating
// the list.

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode tail = new ListNode(0);
        ListNode root = tail;
        while(l1 != null || l2 != null)
        {
            int a = 0;
            int b = 0;
            if(l1 != null)
            {
                a = l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                b = l2.val;
                l2 = l2.next; 
            }
            int sum = a + b;
            sum = carry + sum;
            carry = sum/10;
            if(carry != 0)
            {
                sum = sum % 10;
            }

            root.next = new ListNode(sum);
            root = root.next;
        }
        if(carry != 0)
        root.next = new ListNode(carry);

        return tail.next;
    }
}
