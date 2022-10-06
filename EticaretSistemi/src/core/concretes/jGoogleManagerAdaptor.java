package core.concretes;

import Entities.concretes.User;
import core.abstracts.jgoogleservice;
import jgoogle.jgooglemanager;

public class jGoogleManagerAdaptor implements jgoogleservice {
	
	jgooglemanager googlemanager=new jgooglemanager();
	public void addgoogle(User user) {
		System.out.println("Google ile kayıt oluşturuldu"+ user.getName()+user.getSurname());
		
		
	}
	public void userlogingoogle(User user) {
		System.out.println("Google ile giriş yapıldı"+user.getName()+user.getSurname());
		
	}

}
