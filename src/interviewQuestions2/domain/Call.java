package interviewQuestions2.domain;

public class Call {

	void invoke(Printable p) { // upcasting

		if (p instanceof A) {
			A a = (A) p; // downcasting
			a.a();
		}

		if (p instanceof B) {
			B b = (B) p; // downcasting
			b.b();
		}
	}

}
