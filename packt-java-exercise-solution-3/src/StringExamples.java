import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by Lukasz Madrzak on 16/10/2019.
 */
public class StringExamples {

    public static void main(String[] args) {

        // indent
        String str = "***\n  Welcome\n  \tThe time is now\rHave a great day!\n***";

//        System.out.println(str.indent(0));
//        System.out.println(str.indent(3));
//        System.out.println(str.indent(-3));


        // transform
        String str2Trans = "Tom, Jerry, Michael";
        var res = str2Trans.transform(s -> Arrays.asList(s.split(",")));
//        System.out.println(res);

        // compact number formatting
        NumberFormat upvotes = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes.setMaximumFractionDigits(1);

        System.out.println(upvotes.format(2592123) + " likes");


        NumberFormat upvotes2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes2.setMaximumFractionDigits(1);
        System.out.println(upvotes2.format(1221) + " dislikes");

    }
}
