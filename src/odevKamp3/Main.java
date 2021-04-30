package odevKamp3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    User user1 = new User();
    user1.setId(0);
    user1.setName("Gökay");
    user1.setSurName("Baz");
    
    User user2 = new User();
    user2.setId(1);
    user2.setName("Kodlama.io");
    user2.setSurName("Java Kampý");
    
    InstructorUser instructorUser = new InstructorUser();
    instructorUser.setId(1);
    instructorUser.setInstructorId("jv-egt01");
    instructorUser.setInstructorRole("java eðitmeni");
    instructorUser.setName("Engin");
    instructorUser.setSurName("Demiroð");
    
    StudentUser studentUser = new StudentUser();
    studentUser.setId(2);
    studentUser.setStudentId("jv-std-01");
    studentUser.setName("Gökay");
    studentUser.setSurName("Baz");
    
    UserManager userManager = new UserManager();
    System.out.println("Tek kullanýcý ekleme");
    System.out.println("--------------------------");
    userManager.addUser(user1);
    System.out.println("--------------------------");
    System.out.println("---------------------------");

    User[] userList = {
    	user1,
    	user2,
    };
    System.out.println("Çoklu kullanýcý ekleme");
    System.out.println("---------------------------");
    userManager.addMultipleUser(userList);
    System.out.println("---------------------------");
    System.out.println("---------------------------");
    System.out.println("Öðrenci ekleme");
    System.out.println("---------------------------");
    StudentManager studentManager = new StudentManager();
    studentManager.addStundent(studentUser);
    System.out.println("---------------------------");
    System.out.println("---------------------------");
    System.out.println("Eðitmen ekleme");
    System.out.println("---------------------------");
    InstructorManager instructorManager = new InstructorManager();
    instructorManager.addInstructor(instructorUser);
    
    
	}

}
