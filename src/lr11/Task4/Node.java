package lr11.Task4;

    class Node { //Класс - структура элемента списка
        public int value; // значение
        public Node next; // поле - ссылка(указатель) на след. узел

        Node(int value, Node next) { // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
