package whatIsOutPutExamples;

public class Ex1 {

	public static void main(String[] args) {
		// 1
		int $_ = 5;
		System.out.println($_);

		// 2. break - can be used to break loop / or in switch
		if (false)
			// break;
			System.out.println("SOP");

		while (true) {
			break;
		}

		switch ("A") {
		case "A":
			break;
		default:
			break;
		}
		// 3
		System.out.println("Value :: " + 'A' + 'B');
		System.out.println('A' + 'B');// 65 + 66 =131

	}

	// 4
	public static void main(String args) {

	}
}
