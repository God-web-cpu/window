/**
 * @program: 20200815
 * @description：单链表
 * @author: sun
 * @create: 2020-08-15 14:25
 **/
public class TestDemo {
    public static void createCut(Node headA,Node headB){
        headA.next = headB.next.next;
    }
    public static Node getIntersectionNode(Node headA,Node headB){
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len<0){
            pl = headB;
            ps = headA;
            len = lenB -lenA;
        }
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        while (ps != pl && pl != null && ps != null){
            ps = ps.next;
            pl = pl.next;
        }
        if(ps == pl && pl != null ){
            return pl;
        }
        return null;
    }

    public static Node mergeTwoLists(Node headA,Node headB){
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null){
            if(headA.data < headB.data){
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else{
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null){
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        /*myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);*/
        myLinkedList.addLast(1);
        myLinkedList.addLast(21);
        myLinkedList.addLast(34);
        myLinkedList.addLast(45);
        myLinkedList.addLast(57);
        myLinkedList.addLast(68);

        myLinkedList.display();
        System.out.println();

        MyLinkedList myLinkedList2 = new MyLinkedList();
        /*myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);*/
        myLinkedList2.addLast(10);
        myLinkedList2.addLast(23);
        myLinkedList2.addLast(33);
        myLinkedList2.addLast(42);
        myLinkedList2.addLast(15);
        myLinkedList2.addLast(60);
        myLinkedList2.display();
        System.out.println();

        Node ret = mergeTwoLists(myLinkedList.head,myLinkedList2.head);
        myLinkedList2.display2(ret);
        /*createCut(myLinkedList.head,myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList.head,myLinkedList2.head);
        System.out.println(ret.data);*/



        //System.out.println(myLinkedList.deleteDuplication());

        //System.out.println(myLinkedList.middleNode().data);
        //System.out.println(myLinkedList.FindKthToTial(5).data);
        //Node ret = myLinkedList.partition(17);
        /*Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/
        /*myLinkedList.addIndex(5,100);
        myLinkedList.display();*/
       /* System.out.println("删除开始：");
        myLinkedList.removeAllKey(98);
        myLinkedList.display();*/
        /*myLinkedList.remove(98);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(96);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(94);
        myLinkedList.display();*/


       /* System.out.println();
        System.out.println(myLinkedList.contains(96));
        System.out.println(myLinkedList.size());*/
    }


}
