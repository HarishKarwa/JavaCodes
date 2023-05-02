package learnings.basic;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Harish");
        list.add(0, "Karwa");
        list.addAll(list);
        list.addAll(1, list);

        System.out.println(list.get(3));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("Karwa"));

        Object arr[] = list.toArray();

        System.out.println(list.contains("Harish"));

        list.remove("Harish");
        list.remove(0);
        list.set(0, "Harish");

        list.sort(Comparator.reverseOrder());

        System.out.println(list.size());

        List<String> listOne = list.subList(0, 6);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
