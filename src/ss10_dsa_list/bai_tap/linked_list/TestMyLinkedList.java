package ss10_dsa_list.bai_tap.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("Kiểm tra");
        MyLinkedList ll = new MyLinkedList(20);
        ll.addFirst(1);
        ll.add(5, 15);
        ll.addFirst(2);
        ll.printList();
    }
}
