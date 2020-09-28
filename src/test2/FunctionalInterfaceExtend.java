package test2;

@FunctionalInterface
public interface FunctionalInterfaceExtend<T> extends FunctionalInterface2<T> {
	void accept(T t);
}
