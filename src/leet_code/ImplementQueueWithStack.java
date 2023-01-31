package leet_code;
// https://leetcode.com/problems/implement-queue-using-stacks/description/
import java.util.Stack;

public class ImplementQueueWithStack {
    class MyQueue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
        public MyQueue() {

        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            if(output.isEmpty()){
                shiftInputToOutput();
            }

            return output.pop();
        }

        public int peek() {
            if(output.isEmpty()){
                shiftInputToOutput();
            }

            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }

        public void shiftInputToOutput(){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }
}
