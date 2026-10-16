
package Lab2;

public class MiddleNodeDemo {

    public static void main(String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
        }

        System.out.println("List 1:");
        list1.display();

        Node middle1 = list1.findMiddle();
        System.out.println("Middle Node: " + middle1.data);

        System.out.println();

        SinglyLinkedList list2 = new SinglyLinkedList();

        for (int i = 10; i <= 60; i += 10) {
            list2.add(i);
        }

        System.out.println("List 2:");
        list2.display();

        Node middle2 = list2.findMiddle();
        System.out.println("Middle Node: " + middle2.data);
    }
}

