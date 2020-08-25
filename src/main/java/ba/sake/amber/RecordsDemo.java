package ba.sake.amber;

/**
 * - final class<br>
 * - free: accessors, toString(), equals()+hashCode()<br>
 * - must use primary constructor -> "constructor chaining", a recommended practice
 */
record Person(String name, int age) {}

public class RecordsDemo {

    public static void main(String[] args) {

        var p1 = new Person("Mujo", 28);
        var p2 = new Person("Mujo", 28);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode()));

        System.out.printf("%s ima %d godina.%n", p1.name(), p1.age());

        //new Person("Neko", 13);
    }
}


