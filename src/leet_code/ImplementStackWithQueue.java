package leet_code;
// https://leetcode.com/problems/implement-stack-using-queues/description/
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackWithQueue {
    class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int x) {
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public int pop() {
            return q1.remove();
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }
}
