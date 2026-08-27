package corejava.streams.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListByFirstLetterKata {

    static void main() {
        List<String> list = Arrays.asList("Bag", "Tin", "Alice", "Cab", "Rif");

        List<String> list1 = list.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(list1);
    }
}
