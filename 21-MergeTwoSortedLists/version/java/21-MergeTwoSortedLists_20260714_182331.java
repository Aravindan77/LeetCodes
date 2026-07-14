// Last updated: 7/14/2026, 6:23:31 PM
1class Solution {
2    public ListNode mergeKLists(ListNode[] lists) {
3        if (lists == null || lists.length == 0) {
4            return null;
5        }
6
7        while (lists.length > 1) {
8            List<ListNode> temp = new ArrayList<>();
9            for (int i = 0; i < lists.length; i += 2) {
10                ListNode l1 = lists[i];
11                ListNode l2 = i + 1 < lists.length ? lists[i + 1] : null;
12                temp.add(mergeLists(l1, l2));
13            }
14            lists = temp.toArray(new ListNode[0]);
15        }
16
17        return lists[0];        
18    }
19
20    private ListNode mergeLists(ListNode l1, ListNode l2) {
21        ListNode node = new ListNode();
22        ListNode ans = node;
23
24        while (l1 != null && l2 != null) {
25            if (l1.val > l2.val) {
26                node.next = l2;
27                l2 = l2.next;
28            } else {
29                node.next = l1;
30                l1 = l1.next;
31            }
32            node = node.next;
33        }
34
35        node.next = l1 != null ? l1 : l2;
36        return ans.next;
37    }    
38}