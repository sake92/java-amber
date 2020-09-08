package ba.sake.amber.switch_expr;

import java.time.DayOfWeek;

public class SwitchDemo {

    public static void main(String[] args) {

        switchStatement();
//      switchExpression();
//      switchExpressionExhaustive();
    }

    /**
     * - missing break? <br>
     * - missing default? <br>
     * - forgot to assign in one case? <br>
     * - cant use same var name in 2 cases... :/
     */
    private static void switchStatement() {
        int num = 2 + 2;
        switch (num) {
            case 4:
                int x = 4;
                System.out.println("Four");
                // oops, forgot break;
            case 5:
                //int x = 5; // nope
                System.out.println("Five");
        }
    }


    /**
     * - Single expression is returned <br>
     * - If multiple statements, use <code>yield</code>
     */
    private static void switchExpression() {
        DayOfWeek day = DayOfWeek.THURSDAY;
        int j = switch (day) {
            case MONDAY -> 0;
            case TUESDAY -> 1;
            default -> {
                int k = day.toString().length();
                yield k;
            }
        };
        System.out.println(j);
    }


    //////////
    enum Bool {
        TRUE, FALSE
    }

    /**
     * Exhaustiveness checked by compiler :)
     */
    private static void switchExpressionExhaustive() {
        var bool = Bool.valueOf("TRUE");
        var b = switch (bool) {
            case TRUE -> true;
            case FALSE -> false; // comment out
        };
        System.out.println(b);
    }
}

