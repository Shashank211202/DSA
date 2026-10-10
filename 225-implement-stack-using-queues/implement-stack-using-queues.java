import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.offer(x);
    }

    public int pop() {
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.offer(q.poll());
        }
        return q.poll();
    }

    public int top() {
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.offer(q.poll());
        }
        int front = q.poll();
        q.offer(front);
        return front;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}