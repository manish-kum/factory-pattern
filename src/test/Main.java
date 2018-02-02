package test;

import encryption.Encryptor;
import encryption.impl.AESEncryptor;
import encryption.impl.VeryStrongCustomEncryptor;
import util.Factory;

public class Main {

	public static void main(String[] args) {
		Factory<Encryptor> fact = new Factory<Encryptor>();
		fact.put("AES", AESEncryptor::new);
		fact.put("CUSTOM", VeryStrongCustomEncryptor::new);

		Encryptor en = fact.getEncryptor("AES");
		en.encrypt("test","test" );
	}

}
