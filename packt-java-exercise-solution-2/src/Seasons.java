import java.util.Scanner;

/**
 * Created by Lukasz Madrzak on 23/10/2019.
 */
public class Seasons {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Please enter the month number");
        int input = scanner.nextInt();

        var season = switch (input) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Plz. No such month";
        };

        System.out.println(season);

    }

}
