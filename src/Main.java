import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list1 = positiveEvenAscending(list);
        System.out.println(list1.toString());
    }

    public static List<Integer> ascendingSortOrder(List<Integer> list) {
        int buf;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j + 1) < list.get(j)) {
                    buf = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buf);
                }
            }
        }
        return list;
    }

    public static List<Integer> positive(List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > 0) {
                positiveList.add(integer);
            }
        }
        return positiveList;
    }

    public static List<Integer> even(List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                positiveList.add(integer);
            }
        }
        return positiveList;
    }

    public static List<Integer> positiveEvenAscending(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        integerList = ascendingSortOrder(positive(even(list)));
        return integerList;
    }
}
