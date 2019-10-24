import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lukasz Madrzak on 16/10/2019.
 */
public class TeeingCollector {


    public static void main(String[] args) {

        List<Transaction> employeeList = Arrays.asList(
                new Transaction(1, 120),
                new Transaction(2, 200),
                new Transaction(3, 410),
                new Transaction(4, 820),
                new Transaction(5, 320));

        var result = employeeList.stream().collect(
                Collectors.teeing(
                        Collectors.maxBy(Comparator.comparing(Transaction::getAmount)),
                        Collectors.minBy(Comparator.comparing(Transaction::getAmount)),
                        (transaction, transaction2) -> {
                            HashMap<String, Transaction> map = new HashMap<>();
                            map.put("MAX", transaction.get());
                            map.put("MIN", transaction2.get());
                            return map;
                        }
                )
        );

        System.out.println(result);
    }
}
