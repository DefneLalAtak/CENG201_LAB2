
package Lab2;

public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        int middle = count / 2;
        current = head;

        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        return current;
    }

    public void deleteMiddle() {
        if (head == null) {
            return;
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        int middle = count / 2;

        if (middle == 0) {
            head = head.next;
        } else {
            current = head;

            for (int i = 0; i < middle - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }
    }
}

