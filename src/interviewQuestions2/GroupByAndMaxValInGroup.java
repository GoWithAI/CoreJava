package interviewQuestions2;

/* Save this in a file called Main.java to compile and test it */

import java.io.PrintWriter;
/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
standard library */

/* Do not add a namespace declaration */

/*
 * Rajan Patil, Aundh, 1, Phone Cover, 170, Cash
 *Mohit Gupta, Baner, 1, Samsung Battery, 900, Credit Card
 *Rajan Patil, Aundh, 3, Samsung Battery, 1000, Cash
 *Nina Kothari, Baner, 4, Earphones, Rs 500, Credit Card
 *T Sunitha, Shivajinagar, 5, Earphones, Rs 550, Credit Card
 *Rohan Gade, Aundh, 10, Motorola Battery, Rs 1000, Credit Card
 *Rajan Patil, Shivajinagar, 21, Earphones, Rs 550, Credit Card
 *Rajan Patil, Aundh, 22, USB Cable, Rs 150, UPI
 *Meena Kothari, Baner, 23, USB Cable, Rs 100, Cash
 *Nina Kothari, Baner, 24, USB Cable, Rs 200, UPI
 *Mohit Gupta, Baner, 25, USB Cable, Rs 150, UPI
 * */

public class GroupByAndMaxValInGroup {
	public static List<String> processData(ArrayList<String> array) {
		/*
		 * Modify this method to process `array` as indicated in the question. At the
		 * end, return a List containing the appropriate values
		 *
		 * Please create appropriate classes, and use appropriate data structures as
		 * necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method) as your answer
		 */
		ArrayList<Shop> shops = new ArrayList<Shop>();

		for (String s : array) {
			String[] c = s.split(",");
			Shop d = new Shop(c[0], c[1], c[2], c[3], Integer.valueOf(c[4]), c[5]);
			shops.add(d);
		}

		Map<String, Optional<Shop>> collect = shops.stream().collect(
				Collectors.groupingBy(Shop::getCity, Collectors.maxBy(Comparator.comparingInt(Shop::getPrice))));
		System.out.println(collect);

		List<String> retVal = collect.values().stream().map(s -> s.get()).map(s -> s.getName())
				.collect(Collectors.toList());

		return retVal;
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine())
			inputData.add(in.nextLine());

		System.out.println(inputData);
		System.out.println(inputData.size());

		List<String> retVal = processData(inputData);
		System.out.println(retVal);
		PrintWriter output = new PrintWriter(System.out);
		for (String str : retVal)
			output.println(str);
		output.close();
	}
}
