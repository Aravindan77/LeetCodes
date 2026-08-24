// Last updated: 8/24/2026, 10:18:44 AM
1class MinStack {
2    Stack<Integer> s = new Stack<>(), st = new Stack<>();
3    public void push(int val) {
4        s.push(val);
5        if (st.isEmpty() || val <= st.peek()) st.push(val);
6    }
7    public void pop() {
8        if (s.peek().equals(st.peek())) st.pop();
9        s.pop();
10    }
11    public int top() { return s.isEmpty() ? -1 : s.peek(); }
12    public int getMin() { return st.isEmpty() ? -1 : st.peek(); }
13}