
import DataAccess.concretes.UserDao;
import Entities.concretes.User;
import business.abstracts.IUserService;
import business.concretes.ControlManager;
import business.concretes.UserManager;
import core.concretes.jGoogleManagerAdaptor;

public class main {

	public static void main(String[] args) {

		
				User user=new User();
				
				user.setName("buse");
				user.setSurname("kose");
				user.setEmail("busekose@gmail.com");
				user.setPassword("123456");
				
				System.out.println("----------------------------");
				
				IUserService userService=new UserManager(new UserDao(),new ControlManager(),new jGoogleManagerAdaptor());
				userService.add(user);
				userService.userlogin(user);
				
				
				

			}

		


	}


