package lr11.Task8;

public class LinkedListRec {
    private Node head;

    public void createHeadRec(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    public void createTailRec(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            createTailRec(head, value);
        }
    }

    private void createTailRec(Node node, int value) {
        if (node.next == null) {
            node.next = new Node(value);
        } else {
            createTailRec(node.next, value);
        }
    }

    public String toStringRec() {
        if (head == null) {
            return "";
        } else {
            return head.value + " " + toStringRec(head.next);
        }
    }

    private String toStringRec(Node node) {
        if (node == null) {
            return "";
        } else {
            return node.value + " " + toStringRec(node.next);
        }
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
