package odevKamp3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    User user1 = new User();
    user1.setId(0);
    user1.setName("G�kay");
    user1.setSurName("Baz");
    
    InstructorUser user2 = new InstructorUser();
    user2.setId(1);
    user2.setInstructorId("jv-egt01");
    user2.setInstructorRole("Java E�itmeni");
    user2.setName("Engin");
    user2.setSurName("Demiro�");
    
    StudentUser user3 = new StudentUser();
    user3.setId(2);
    user3.setStudentId("jv-std-01");
    user3.setName("G�kay");
    user3.setSurName("Baz");
    
    UserManager userManager = new UserManager();
    System.out.println("Tek kullan�c� ekleme");
    System.out.println("--------------------------");
    userManager.addUser(user1);
    System.out.println("--------------------------");

    User[] userList = {
    	user1,
    	user2,
    	user3
    };
    System.out.println("�oklu kullan�c� ekleme");
    System.out.println("---------------------------");
    userManager.addMultipleUser(userList);
	}

}
