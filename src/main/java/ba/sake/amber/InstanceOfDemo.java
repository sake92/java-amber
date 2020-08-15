package ba.sake.amber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class InstanceOfDemo {

    public static void main(String[] args) {

        // using random to trick Intellij's smartness
        var rand = new Random();

        Object obj = rand.nextBoolean() ? "abc" : 5;
        if (obj instanceof String s) {
            System.out.println("String with length: " + s.length());
        }


        /* COMPLEX CONDITIONS */
        Collection<String> coll = rand.nextBoolean() ? new ArrayList<>() : new LinkedList<>();
        coll.add("whatever");

        if (coll instanceof ArrayList<?> list && list.size() == 1) {
            Object o = list.get(0); // works (compiles)
            System.out.println(o);
        }


        // here "list" is NOT BOUND after OR condition !!!
        // conditions are mutually exclusive...
        if (coll instanceof ArrayList<?> list || coll.size() > 5) {
            // list.get(0); // nope
        }
    }
}
