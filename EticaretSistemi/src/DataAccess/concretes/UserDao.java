package DataAccess.concretes;

import javax.swing.JList;

import DataAccess.abstracts.IUserDao;
import Entities.concretes.User;

public class UserDao implements IUserDao {
	public void add(User user) {
		System.out.println("Veri tabanına kullanıcı kayıtı yapıldı"+ user.getName());
		System.out.println("lütfen e posta adresinizi dogrulayınız"+ user.getEmail());
		
		
		
	}
	public void userlogin(User user) {
		System.out.println("Kullanıcı girişi yapıldı"+ user.getName()+ user.getSurname());
		
	}
	int get(int password) {
		return password;
	}
	JList<User>getAll() {
		return null;
	}
	
	

}
