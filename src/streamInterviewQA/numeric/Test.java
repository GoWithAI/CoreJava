package streamInterviewQA.numeric;

public class Test {

	public static void main(String[] args) {
		String str = "http://www.tenerity.com/team/////";

		char[] charArray = str.toCharArray();

		int index = 0;

		for (int i = charArray.length - 1; charArray[i] == '/'; i--) {
			index = i;
		}

		String substring = index ==0 ? str : str.substring(0, index);
		System.out.println(substring);
		
		
		str.endsWith("/");
	}

}


