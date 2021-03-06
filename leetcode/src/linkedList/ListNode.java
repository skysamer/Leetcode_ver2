package linkedList;

import java.util.Stack;

public class ListNode {
	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) { 
		this.val = val; 
	}  
	
	ListNode(int val, ListNode next) { 
		this.val = val; 
		this.next = next; 
	}

}

class Solution{
	public boolean isPalindrome(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		
		Stack<Integer> stk=new Stack<Integer>();
		
		while(fast!=null && fast.next!=null) {
			stk.push(slow.val);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		if(fast!=null) {
			slow=slow.next;
		}
		
		while(slow!=null) {
			int top=stk.pop();
			
			if(top!=slow.val) {
				return false;
			}
			slow=slow.next;
		}
        
		return true;
    }
}
