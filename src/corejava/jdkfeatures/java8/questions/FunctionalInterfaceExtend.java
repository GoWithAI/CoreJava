package corejava.jdkfeatures.java8.questions;

@FunctionalInterface
public interface FunctionalInterfaceExtend<T> extends FunctionalInterface2<T> {
	void accept(T t);
}
