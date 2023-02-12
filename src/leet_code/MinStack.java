package leet_code;
// https://leetcode.com/problems/min-stack/description/
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>= val){
            minStack.push(val);
        }
    }

    public void pop() {
        int val = stack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
