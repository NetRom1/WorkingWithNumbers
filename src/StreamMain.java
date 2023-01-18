import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(integer -> integer > 0)
                .filter(integer -> integer%2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(integer -> integer + " ")
                .collect(Collectors.toList())
                .forEach(System.out::print);
    }
}
