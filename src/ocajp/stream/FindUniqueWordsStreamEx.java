package ocajp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueWordsStreamEx {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("hello", "world");
		List<String> words2 = Arrays.asList("aaaaaabbbdccceee");

		List<String> uniqueWords = words2.stream().flatMap( word -> Arrays.stream(word.split("")))
		.distinct()
		.collect(Collectors.toList());
		System.out.println(uniqueWords);
	}

}
