/**
 * Created by Lukasz Madrzak on 16/10/2019.
 */
public class StringExamples {

    public static void main(String[] args) {

        // formatted
        String city = "New York";

        String query = """
               SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
               WHERE `CITY` = '%s'
               ORDER BY `EMP_ID`, `LAST_NAME`;
               """;

        var string = query.formatted(city);

//        System.out.println(string);

        // stripIndent
        String s = """
            \t<html>
            \t\t<body>
            \t\t\t<p>Hello, is it me you're looking for?</p>
            \t\t</body>
            \t</html>
            \t""";

        System.out.println("No stripIndent()");
        System.out.println(s);

        System.out.println("With stripIndent()");
        System.out.println(s.stripIndent());

        System.out.println("With stripIndent() and translateEscapes()");
        System.out.println(s.stripIndent().translateEscapes());

        // translateEscapes
        String s2 = """
            \t<html>
            \t\t<body>
            \t\t\t<p>Hello, is it me you're looking for?</p>\\n
            \t\t</body>
            \t</html>
            \t""";

        System.out.println("No translateEscapes()");
        System.out.println(s2.stripIndent());

        System.out.println("With translateEscapes()");
        System.out.println(s2.stripIndent().translateEscapes());


        // translateEscapes
    }
}
