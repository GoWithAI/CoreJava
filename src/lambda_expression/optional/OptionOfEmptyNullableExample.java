package lambda_expression.optional;

import java.util.Optional;

public class OptionOfEmptyNullableExample {

	public static Optional<String> ofNullable() {
		return Optional.ofNullable("Hello");
	}

	public static Optional<String> of() {
		return Optional.of(null);
	}

	public static Optional<String> empty() {
		return Optional.empty();
	}

	public static void main(String[] args) {

		System.out.println(ofNullable());
		System.out.println(empty());
		System.out.println(of());

	}

}
