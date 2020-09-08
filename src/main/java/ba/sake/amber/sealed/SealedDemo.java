package ba.sake.amber.sealed;

import java.util.ArrayList;

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
            else // TODO implement reachability/exhaustiveness
                throw new IllegalStateException("Impossible!");
        });


        // var adHoc = new Shape(){}; // nope!
        // shapes.add(adHoc);
    }

}
