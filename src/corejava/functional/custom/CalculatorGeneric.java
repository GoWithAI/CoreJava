package corejava.functional.custom;

@FunctionalInterface
public interface CalculatorGeneric<T, V, W, U> {

	U calculator(T t, V v, W w);

}
