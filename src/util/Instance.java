package util;
/*
Functional interface for creating Instances
*/
@FunctionalInterface
public interface Instance<E> {
	E getInstance();
}
