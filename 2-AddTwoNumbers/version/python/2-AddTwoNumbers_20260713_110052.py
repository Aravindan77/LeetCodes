# Last updated: 7/13/2026, 11:00:52 AM
1class Solution(object):
2    def removeNthFromEnd(self, head, n):
3        dummy = ListNode(0)
4        dummy.next = head
5        first = dummy
6        second = dummy
7
8        for _ in range(n + 1):
9            first = first.next
10
11        while first is not None:
12            first = first.next
13            second = second.next
14
15        second.next = second.next.next
16
17        return dummy.next