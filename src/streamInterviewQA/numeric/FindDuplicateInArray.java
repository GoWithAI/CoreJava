package streamInterviewQA.numeric;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

        Set<Integer> result = findDuplicateBySetAdd(list);
        System.out.println(result);
	}

	private static Set<Integer> findDuplicateBySetAdd(List<Integer> list) {
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> collect = list.stream().filter( i -> !unique.add(i)).collect(Collectors.toSet());
		return collect;
	}

}
