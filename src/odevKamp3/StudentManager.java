package odevKamp3;

public class StudentManager extends UserManager {
   public void addStundent(StudentUser user) {
	   System.out.println("** "+user.getStudentId()+" ��renci numaral� "+user.getName() +" adl� ��renci sisteme eklendi !");
   }
}
