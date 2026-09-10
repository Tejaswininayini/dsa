package Demo;

public class NthNodeFromEnd {
	static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    int findNthFromEnd(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

        Node first = head;
        Node second = head;

        // Move first pointer n positions ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                throw new IllegalArgumentException("Invalid n");
            }
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static void main(String[] args) {

        NthNodeFromEnd list = new NthNodeFromEnd();

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        // Connecting the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Assigning head
        list.head = n1;

        int n = 2;

        System.out.println(
            n + "nd node from end = " +
            list.findNthFromEnd(n)
        );
    }
}


