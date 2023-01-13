package ss11_stack_queue.bai_tap.circular_linked_list;

import java.util.Queue;

class Solution {
    public static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else q.rear.link = temp;

        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf("Element in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enQueue(q, 10);
        enQueue(q, 15);
        enQueue(q, 5);
        displayQueue(q);
        System.out.printf("Deleted value = %d", deQueue(q));
        System.out.printf("Deleted value = %d", deQueue(q));
        displayQueue(q);
        enQueue(q, 20);
        enQueue(q, 2);
        displayQueue(q);
    }
}



