package odevKamp3;

public class InstructorManager extends UserManager {
  public void addInstructor(InstructorUser user) {
	  System.out.println("** "+user.getInstructorId() + " e�itmen numaral� " + user.getInstructorRole() + " " + user.getName()+" "+user.getSurName()+" sisteme eklendi !");
  }
}
