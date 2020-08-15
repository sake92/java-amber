package ba.sake.amber;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Comparator;

public class VarDemo {

    public static void main(String[] args) {

        var str = "abc";
        System.out.println(str);


        var integer = 123;
        System.out.println(integer);


        // in lambdas:
        Comparator<String> c =
                (@NotNull var x, var y) -> -x.compareTo(y);

    }
}

// example..
@Target({ElementType.TYPE_USE, ElementType.PARAMETER})
@interface NotNull {
}