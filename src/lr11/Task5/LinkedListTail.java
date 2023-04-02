package lr11.Task5;

public class LinkedListTail {
    private Node head;
    private Node tail;

    public LinkedListTail() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int value) {
        if (head == null) {
            tail = new Node(value, null);
            head = tail;
        } else {
            tail.next = new Node(value, null);
            tail = tail.next;
        }
    }

    public void printList() {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public static void main(String[] args) {
        LinkedListTail list = new LinkedListTail();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
    }
}
