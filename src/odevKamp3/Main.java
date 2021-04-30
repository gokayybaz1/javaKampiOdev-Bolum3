package odevKamp3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    User user1 = new User();
    user1.setId(0);
    user1.setName("G�kay");
    user1.setSurName("Baz");
    
    User user2 = new User();
    user2.setId(1);
    user2.setName("Kodlama.io");
    user2.setSurName("Java Kamp�");
    
    InstructorUser instructorUser = new InstructorUser();
    instructorUser.setId(1);
    instructorUser.setInstructorId("jv-egt01");
    instructorUser.setInstructorRole("java e�itmeni");
    instructorUser.setName("Engin");
    instructorUser.setSurName("Demiro�");
    
    StudentUser studentUser = new StudentUser();
    studentUser.setId(2);
    studentUser.setStudentId("jv-std-01");
    studentUser.setName("G�kay");
    studentUser.setSurName("Baz");
    
    UserManager userManager = new UserManager();
    System.out.println("Tek kullan�c� ekleme");
    System.out.println("--------------------------");
    userManager.addUser(user1);
    System.out.println("--------------------------");
    System.out.println("---------------------------");

    User[] userList = {
    	user1,
    	user2,
    };
    System.out.println("�oklu kullan�c� ekleme");
    System.out.println("---------------------------");
    userManager.addMultipleUser(userList);
    System.out.println("---------------------------");
    System.out.println("---------------------------");
    System.out.println("��renci ekleme");
    System.out.println("---------------------------");
    StudentManager studentManager = new StudentManager();
    studentManager.addStundent(studentUser);
    System.out.println("---------------------------");
    System.out.println("---------------------------");
    System.out.println("E�itmen ekleme");
    System.out.println("---------------------------");
    InstructorManager instructorManager = new InstructorManager();
    instructorManager.addInstructor(instructorUser);
    
    
	}

}
