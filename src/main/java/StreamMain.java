import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println(intList);

        List<Integer> positivList = streamFilterPositiv(intList);
        List<Integer> evenList = streamFilterEven(positivList);
        List<Integer> orderList = streamSorted(evenList);
        System.out.println(orderList);
//        intList.stream()
//                .filter(x -> x > 0)
//                .filter(x -> x % 2 == 0)
//                .sorted(Comparator.naturalOrder())
//                .forEach(System.out::println);

    }

    public static List<Integer> streamFilterPositiv(List<Integer> intList) {
        return intList.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> streamFilterEven(List<Integer> positivList) {
        return positivList.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> streamSorted(List<Integer> evenList) {
        return evenList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
