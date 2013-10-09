package tutoriallapp;

import javax.enterprise.inject.Produces;

public class Mails {
	
	public String getMail(){
		return "ABCD";
	}
	
	@Produces
	public static Mails newInstance(){
		return new Mails();
	}

}
