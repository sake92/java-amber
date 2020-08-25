package ba.sake.amber;

/**
 * - cut on lowest number of spaces <br>
 * - use <code>\</code> to concatenate lines <br>
 * - use <code>\s</code> to preserve trailing spaces
 */
public class MulitilineStringDemo {

    public static void main(String[] args) {

        var multiLine = """
                This is    
                some   
                "quoted" text.
                """;
        System.out.println(multiLine);
        System.out.println();

        String singeLine = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
        System.out.println(singeLine);
        System.out.println();

        String markdown = """
                # Title   
                Text here    \s
                space\s
                """;
        System.out.println(markdown);
    }
}
