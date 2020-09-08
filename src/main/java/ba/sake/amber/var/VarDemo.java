package ba.sake.amber.var;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Comparator;

/**
 * - type is inferred! <br>
 * - local only: in method or in constructor! <br>
 * - <code>var</code> is a reserved type name <br>
 * - can be used in lambdas (for consistency) <br>
 * - public API is intact: fields and methods
 */
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