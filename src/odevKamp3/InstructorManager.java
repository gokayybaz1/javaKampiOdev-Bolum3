package odevKamp3;

public class InstructorManager {
  public void addInstructor(InstructorUser user) {
	  System.out.println("** "+user.getInstructorId() + " e�itmen numaral� " + user.getInstructorRole() + " " + user.getName()+" "+user.getSurName()+" sisteme eklendi !");
  }
}
