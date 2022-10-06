package DataAccess.abstracts;

import Entities.concretes.User;

public interface IUserDao {
 public void add(User user);
 public void userlogin(User user);
}
