import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lukasz Madrzak on 24/10/2019.
 */
public class TeeingCollectorExerciseLive {


    public static void main(String[] args) {

        List<City> cityList = Arrays.asList(
                new City("London", "Western Europe", 4500),
                new City("Warsaw", "Eastern Europe", 1500),
                new City("Berlin", "Central Europe", 2500),
                new City("New York", "North America", 6000),
                new City("Rio De Janeiro", "South America", 2200),
                new City("Shanghai", "East Asia", 3000),
                new City("Melbourne", "Australia", 4100)
        );

        var result = cityList.stream().collect(
                Collectors.teeing(
                        // first collector
                        Collectors.filtering(city -> city.getRegion().contains("Europe") && city.getAvgSalary() > 2000,
                                Collectors.mapping(city -> city.getName(), Collectors.toList())),
                        // second collector
                        Collectors.filtering(city -> city.getRegion().contains("Europe") && city.getAvgSalary() > 2000,
                                Collectors.counting()),
                        // bifunction
                        (cities, count) -> "Result[cities=" + cities + ",count=" + count + "]")
        );

        System.out.println(result);

    }
}
