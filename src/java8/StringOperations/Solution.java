package java8.StringOperations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {

	public boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
		return Stream.of(word1).collect(Collectors.joining()).equals(Stream.of(word2).collect(Collectors.joining()));
	}

	public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {

		Stream<String> w1 = Stream.of(word1);
		String s1 = w1.collect(Collectors.joining());

		Stream<String> w2 = Stream.of(word2);
		String s2 = w2.collect(Collectors.joining());

		if (s1.equals(s2))
			return true;

		return false;

	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (String s : word1) {
			sb1.append(s);
		}

		for (String s : word2) {
			sb2.append(s);
		}

		if (sb1.equals(sb2)) {
			return true;
		}

		return false;

	}
}