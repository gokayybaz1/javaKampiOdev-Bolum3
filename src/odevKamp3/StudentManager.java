package odevKamp3;

public class StudentManager extends UserManager {
   public void addStundent(StudentUser user) {
	   System.out.println("** "+user.getStudentId()+" öğrenci numaralı "+user.getName() +" adlı öğrenci sisteme eklendi !");
   }
}
