package util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory<T> {
	private Map<String, Supplier<T>> factoryMap = new HashMap<>();

	public synchronized T getEncryptor(String key) {
		Supplier<T> instanceSupplier = factoryMap.get(key);
		if (test != null)
			return instanceSupplier.get();
		else
			return null;
	}

	public synchronized void put(String key, Supplier<T> value) {
		factoryMap.put(key, value);

	}
}
