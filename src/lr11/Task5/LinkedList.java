package lr11.Task5;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void printList() {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
    }
}
