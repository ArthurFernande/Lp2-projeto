package main;

import easyaccept.EasyAccept;

public class Main {
	
	public static void main(String[] args) {
	    args = new String[] {"facade.Facade", "us/us1_test.txt", "us/us2_test.txt"}; //separe cada script de teste por virgula.
	    
	    EasyAccept.main(args);
	}

}
