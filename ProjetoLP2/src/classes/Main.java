package classes;

import easyaccept.EasyAccept;

public class Main {

	public static void main(String[] args) {
		args = new String[] { "classes.Facade", "us/us1_test.txt",
				"us/us2_test.txt" }; // separe cada script de teste por virgula.

		EasyAccept.main(args);

	}

}
