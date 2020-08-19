/**
 * @program: 20200816
 * @description
 * @author: sun
 * @create: 2020-08-19 12:38
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();
        myLinkedList.addIndex(0,99);
        myLinkedList.display();
        myLinkedList.addIndex(5,199);
        myLinkedList.display();
        myLinkedList.addIndex(2,9999);
        myLinkedList.display();
        myLinkedList.remove(199);
        myLinkedList.display();


        /*System.out.println(myLinkedList.contains(4));
        System.out.println(myLinkedList.size());*/
    }
}
