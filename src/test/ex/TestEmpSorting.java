package test.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmpSorting {
    static void main() {
        List<Emp> list = new ArrayList<>();

        Map<String, List<Emp> > map = list.stream().collect(Collectors.groupingBy(Emp::getDep, e -> e ));




    }
}
