package util;
/*
Functional interface for creating any type ofInstances
*/
@FunctionalInterface
public interface Instance<E> {
	E getInstance();
}
