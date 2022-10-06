package business.concretes;

import DataAccess.concretes.UserDao;
import Entities.concretes.User;
import business.abstracts.IUserService;
import core.abstracts.jgoogleservice;

public class UserManager implements IUserService {
	 UserDao userdao;
	 ControlManager controlmanager;
	 jgoogleservice googleservice;
	public UserManager(UserDao userdao, ControlManager controlmanager, jgoogleservice googleservice) {
		super();
		this.userdao = userdao;
		this.controlmanager = controlmanager;
		this.googleservice = googleservice;
	}
    public void add(User user) {
	  if(controlmanager.emailControl(user)&&controlmanager.nameControl(user)&&controlmanager.password(user));
	  {
		  userdao.add(user);
		  googleservice.addgoogle(user);
		  
	  }}
	  public void userlogin(User user) {
		  if(user.getEmail()=="busekose@gmail.com"&& user.getPassword()=="123456") {
	   userdao.userlogin(user);
	   googleservice.userlogingoogle(user);
		  }
		  else {
			  System.out.println("giris yapılamadı");
		  }
	  
    
  }
	
	
	
	

}
