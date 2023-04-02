package lr11.Task8;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void createHead(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void createTail(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public String toString() {
        if(head == null) {
            return "List is empty";
        }
        String result = "";
        Node temp = head;
        while(temp != null) {
            result += temp.data + " ";
            temp = temp.next;
        }
        return result;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insert(int data, int position) {
        if(position < 1 || position > size + 1) {
            System.out.println("Invalid position!");
            return;
        }
        Node newNode = new Node(data);
        if(position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for(int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
        if(head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    public void remove(int position) {
        if(position < 1 || position > size) {
            System.out.println("Invalid position!");
            return;
        }
        if(position == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for(int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
