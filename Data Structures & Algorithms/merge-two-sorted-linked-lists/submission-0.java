class Solution { 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
        // Create a dummy node to act as the anchor for the new list
        ListNode dummy = new ListNode(); 
        ListNode temp = dummy; 
        
        // Traverse through both lists simultaneously
        while (list1 != null && list2 != null) { 
            if (list1.val <= list2.val) { 
                temp.next = list1; 
                list1 = list1.next; 
            } else { 
                temp.next = list2; 
                list2 = list2.next; 
            } 
            temp = temp.next; 
        } 
        
        // Append the remaining nodes from whichever list is not empty
        if (list1 != null) { 
            temp.next = list1; 
        } else { 
            temp.next = list2; 
        } 
        
        // Return the actual head, skipping the dummy node
        return dummy.next; 
    } 
}
