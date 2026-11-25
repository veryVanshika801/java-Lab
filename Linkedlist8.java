import java.util.Scanner;

public class Linkedlist8 {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node remove(Node head, int x) {

        if (head == null) {
            return null;
        }

        head.next = remove(head.next, x);

        if (head.val == x) {
            return head.next;
        }

        return head;
    }

    public static void print(Node head) {

        if (head == null) {
            return;
        }

        System.out.print(head.val + " ");
        print(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int x = sc.nextInt();

        head = remove(head, x);

        if (head == null) {
            System.out.println("Empty");
        } else {
            print(head);
        }
    }
}
