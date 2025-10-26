package classwork.day8;

import com.sun.source.tree.Tree;

import java.util.*;

public class HashTree {
    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        for (int i = 0; i < 100000; i++) {
            myList1.add("mom " + i);
            myList2.add("mom " + i);
        }

        long t1 = System.currentTimeMillis();
        Iterator<String> iterator = myList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }


        System.out.println(System.currentTimeMillis() - t1);


        long t2 = System.currentTimeMillis();
        Iterator<String> iterator2 = myList2.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
        }

        System.out.println(System.currentTimeMillis() - t2);

    }
}