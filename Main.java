public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(11);
        list.addFirst(33);
        list.addFirst(44);
        list.addFirst(14);
        list.addFirst(17);
        System.out.println("Linded list: " + list );
        list.addLast(99);
        System.out.println("Linded list: " + list );
        System.out.println("Find element " + list.getElement(17));
        System.out.println("Find element " + list.getElement(87));
        list.remove(14);
        System.out.println("Linded list: " + list );
        list.remove(16);
        System.out.println("Linded list: " + list );
    }
}
