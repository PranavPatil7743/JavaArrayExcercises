/*You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:
Input: list1 = [], list2 = []
Output: []
Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Example usage
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(20);
        l1.next.next = new ListNode(40);

        ListNode l2 = new ListNode(10);
        l2.next = new ListNode(30);
        l2.next.next = new ListNode(40);

        ListNode mergedList = solution.mergeTwoLists(l1, l2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        // Output: 1 1 2 3 4 4
    }

    public ListNode mergeTwoLists(ListNode listFirst, ListNode listSecond) {
        // Dummy node to start the merged list
        ListNode dummy = new ListNode(0);  //created new instance of ListNode as a dummy node with value 0
        ListNode current = dummy; // created pointer to keep track, both dummy and current pointing to same node and afterwards current will move when we iterate

        // Merge the two lists until one of them becomes null
        while (listFirst != null && listSecond != null) {
            if (listFirst.val < listSecond.val) {
                current.next = listSecond;//current =30
                listFirst = listFirst.next; // listfirst = 20 3rd listFirst=40
            } else {
                current.next = listSecond; //current.next is populated with second list = 10, 30, 40
                listSecond = listSecond.next; //listsecond = 30, 40
            }
            current = current.next; //current = 10 2nd current =30
        }

        // If one of the lists is not empty, append it to the merged list
        if (listFirst != null) {
            current.next = listFirst;
        } else {
            current.next = listSecond;
        }

        // The merged list starts from the next of the dummy node
        return dummy.next;
    }
}
