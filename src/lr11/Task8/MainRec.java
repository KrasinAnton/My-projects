package lr11.Task8;

public class MainRec {
    public static void main(String[] args) {
        LinkedListRec list = new LinkedListRec();

        list.createHeadRec(1);
        list.createHeadRec(2);
        list.createHeadRec(3);

        System.out.println(list.toStringRec());

        list.createTailRec(4);
        list.createTailRec(5);
        list.createTailRec(6);

        System.out.println(list.toStringRec());
    }
}
