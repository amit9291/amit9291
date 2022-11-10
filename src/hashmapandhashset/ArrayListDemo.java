package hashmapandhashset;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("Amit");
        obj.add("10");
        obj.add("10.20");
        obj.add('A');
        obj.add(true);
        System.out.println(obj);
        obj.add(1, "Amit");
        System.out.println(obj);
        Iterator<Object> it = obj.iterator();
        System.out.println("Iterator list :");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //System.out.println(it.next());
        System.out.println("-------------------");
        System.out.println(!it.equals("Amit"));


    }
}
