/**
 * Created by Lukasz Madrzak on 16/10/2019.
 */
public class TextBlocksExample {

    public static void main(String[] args) {

        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";

        System.out.println(html);

        String betterHtml = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;

        System.out.println(betterHtml);


        String query = "SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`\n" +
                "WHERE `CITY` = 'INDIANAPOLIS'\n" +
                "ORDER BY `EMP_ID`, `LAST_NAME`;\n";

        System.out.println(query);

        String betterQuery = """
               SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
               WHERE `CITY` = 'INDIANAPOLIS'
               ORDER BY `EMP_ID`, `LAST_NAME`;
               """;

        System.out.println(betterQuery);


        String json = ""
                + " {\n"
                + "     greeting: \"Hello\",\n"
                + "     audience: \"Programmers,\n\t Text Blocks are amazing\",\n"
                + "     punctuation: \"!\"\n"
                + " }\n";

        System.out.println(json);

        String jsonBlock = """
            {
                 greeting: "Hello",
                 audience: "Programmers,
                 Text Blocks are amazing",
                 punctuation: "!"
            }
            """;

        System.out.println(jsonBlock);
    }
}
