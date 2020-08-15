package ba.sake.amber;

import java.time.DayOfWeek;

public class SwitchDemo {

    public static void main(String[] args) {

        switchStatement();
//      switchExpression();
//      switchExpressionExhaustive();
    }

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

    /* Exhaustiveness checked by compiler :) */
    enum Bool {
        TRUE, FALSE
    }

    private static void switchExpressionExhaustive() {
        var bool = Bool.valueOf("TRUE");
        var b = switch (bool) {
            case TRUE -> true;
            case FALSE -> false; // comment out
        };
        System.out.println(b);
    }
}

