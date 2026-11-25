public class Linkedlist2 {
    static class Node {
        int val;
        Node next;

        Node() {
            this(0);
        }

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static int count(Node head) {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        int n = 10;
        Node tail = head;
        for (int i = 2; i <= n; i++) {
            Node newNode = new Node(i);
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println(count(head));
    }
}
