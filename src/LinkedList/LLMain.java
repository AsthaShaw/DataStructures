package LinkedList;

public class LLMain {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList(4);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.append(2);
        //linkedList.printList();
        linkedList.prepend(3);
        linkedList.printList();
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast());//can't do null.value

//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst().value);
//        System.out.println(linkedList.removeFirst());

        System.out.println("Get index 1::"+linkedList.get(1).value);
        linkedList.printList();
        System.out.println("Set at index 1::"+linkedList.set(1,100));
        linkedList.printList();
        linkedList.insert(1,1);
        linkedList.printList();
        System.out.println(linkedList.remove(2));
        linkedList.printList();
    }



}
