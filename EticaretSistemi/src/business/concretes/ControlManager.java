package business.concretes;

import java.util.regex.Pattern;

import Entities.concretes.User;
import business.abstracts.IController;

public class ControlManager implements IController {
   public boolean password(User user) {
	   String password=user.getPassword();
	   boolean dogrumu =true;
	   if(password=="123456") {
		   return dogrumu;
	   }
	   else {
		   System.out.println("geçersiz sifre");
		   return dogrumu;
	   }}
	 
	   public boolean emailControl(User user) {
	    	String mail=user.getEmail();
	        boolean et= Pattern.matches(".*@.*", mail);
	        boolean dotCom=Pattern.matches(".*.com", mail);
	        if (dotCom && et) {
	        	return true;
	        }
	        else {
	       	 System.out.println("Geçersiz Email");
	       	 return false;
	        }}
	
	   
	        public boolean nameControl(User user) {
	   		 boolean nameControl=true;
	   		 if (user.getName().length()>2 && user.getName().length()>2) {
	   			return nameControl;
	   		}
	   		 else {
	   			 System.out.println("Geçersiz ad ve soyad");
	   			 return false;
	   		 }
	   	 }
	   
   }

