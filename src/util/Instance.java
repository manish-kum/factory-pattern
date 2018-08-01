package util;
/*
Functional interface for creating any type of Instances
*/
@FunctionalInterface
public interface Instance<E> {
	E getInstance();
}
