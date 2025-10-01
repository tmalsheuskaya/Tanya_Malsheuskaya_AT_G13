package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountTime {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add("mom " +i);
        }

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++){
            arrayList.get(i);
        }

        System.out.println(System.currentTimeMillis() -t1);

        for (int i = 0; i < 100000; i++) {
            linkedList.add("mom" + i);
        }

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }

        System.out.println(System.currentTimeMillis() -t2);
    }
}
