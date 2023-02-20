package java8.interview;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface FunctionalInterface2<T> {

	void accept(T t);

	default Consumer<T> andThen(Consumer<? super T> after) {
		Objects.requireNonNull(after);
		return (T t) -> {
			accept(t);
			after.accept(t);
		};
	}
	
	public static void t() {
		
	}
}
