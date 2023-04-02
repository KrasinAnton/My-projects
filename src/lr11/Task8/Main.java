package lr11.Task8;

public class Main {
    public static void main(String[] args) {
        // Создаем список
        LinkedList list = new LinkedList();

        // Добавляем элементы
        list.createHead(1);
        list.createHead(2);
        list.createHead(3);

        // Выводим список
        System.out.println(list.toString());

        // Добавляем элемент в начало
        list.addFirst(0);

        // Выводим список
        System.out.println(list.toString());

        // Добавляем элемент в конец
        list.addLast(4);

        // Выводим список
        System.out.println(list.toString());

        // Вставляем элемент на позицию 2
        list.insert(2, 5);

        // Выводим список
        System.out.println(list.toString());

        // Удаляем элемент с головы
        list.removeFirst();

        // Выводим список
        System.out.println(list.toString());

        // Удаляем последний элемент
        list.removeLast();

        // Выводим список
        System.out.println(list.toString());

        // Удаляем элемент на позиции 2
        list.remove(2);

        // Выводим список
        System.out.println(list.toString());
    }
}
