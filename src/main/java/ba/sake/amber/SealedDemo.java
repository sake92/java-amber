package ba.sake.amber;

import java.util.ArrayList;

sealed class Shape {}

final class Circle extends Shape {}

final class Rectangle extends Shape {}

final class Square extends Shape {}

public class SealedDemo {
    public static void main(String[] args) {

        var shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Square());

        shapes.forEach(shape -> {
            if (shape instanceof Circle c)
                System.out.println("Circle: " + c);
            else if (shape instanceof Rectangle r)
                System.out.println("Rectangle: " + r);
            else if (shape instanceof Square s)
                System.out.println("Square: " + s);
            else
                throw new IllegalStateException("Impossible!");
        });

        
        // var adHoc = new Shape(){}; // nope!
        // shapes.add(adHoc);
    }

}

// beautiful!
sealed interface Shape2 {}

record Circle2() implements Shape2 {}

record Rectangle2() implements Shape2 {}

record Square2() implements Shape2 {}
