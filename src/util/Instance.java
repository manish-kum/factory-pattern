package util;
/*
Functional interface for creating generic Instances
*/
@FunctionalInterface
public interface Instance<E> {
	E getInstance();
}
