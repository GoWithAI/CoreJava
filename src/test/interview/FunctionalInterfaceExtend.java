package test.interview;

@FunctionalInterface
public interface FunctionalInterfaceExtend<T> extends FunctionalInterface2<T> {
	void accept(T t);
}
