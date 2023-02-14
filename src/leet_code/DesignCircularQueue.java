package leet_code;
// https://leetcode.com/problems/design-circular-queue/description/
public class DesignCircularQueue {
    int[] arr;
    int font = 0;
    int rear = 0;
    int size = 0;

    public DesignCircularQueue(int k) {
        arr = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        arr[font] = 0;
        font = (font + 1) % arr.length;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[font];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[(rear - 1 + arr.length) % arr.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}
