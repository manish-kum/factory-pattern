package util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory<T> {
	private  ConcurrentMap<String, Supplier<T>> factoryMap = new ConcurrentHashMap<>();

	public  synchronized T getEncryptor(String key) {
		Supplier<T> instanceSupplier = factoryMap.get(key);
		if (instanceSupplier != null)
			return instanceSupplier.get();
		else
			return null;
	}

	public  void put(String key, Supplier<T> value) {
		factoryMap.put(key, value);

	}
}
