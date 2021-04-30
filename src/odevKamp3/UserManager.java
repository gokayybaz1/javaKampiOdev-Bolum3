package odevKamp3;

public class UserManager {
   public void addUser(User user) {
	   System.out.println("* " +user.getName()+" adlý kullanýcý Eklendi !");
   }
   
   public void addMultipleUser(User[] user) {
	   for (User user2 : user) {
		addUser(user2);
	}
   }
}
