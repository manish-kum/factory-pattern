package util;

import java.util.HashMap;
import java.util.Map;

public class Factory<T> {
	private Map<String, Instance<T>> factory = new HashMap<>();

	public synchronized T getEncryptor(String key) {

		Instance<T> test = factory.get(key);
		if (test != null)
			return test.getInstance();
		else
			return null;
	}

	public synchronized void put(String key, Instance<T> value) {
		factory.put(key, value);

	}
}
