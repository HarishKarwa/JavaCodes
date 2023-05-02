package learnings.basic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //adding elements
        list.add(1);
        list.add(0, 2);
        list.addFirst(3);
        list.addLast(4);
        list.push(5);
        list.offer(7); //last
        list.offerFirst(8);
        list.offerLast(9);

        //list in reverse order
        Iterator iterator = list.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list.isEmpty());
        System.out.println(list.contains(6));
        System.out.println(list.element());
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll());
        // pollFirst and pollLast
        System.out.println(list.pop());
        // popFirst and popLast
        System.out.println(list.removeFirstOccurrence(3));

        Object[] arr = list.toArray();
    }
}
