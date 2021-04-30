package odevKamp3;

public class StudentUser extends User{
  private String studentId;
  private String studentRole;

public String getStudentRole() {
	return studentRole;
}

public void setStudentRole(String studentRole) {
	this.studentRole = studentRole;
}

public String getStudentId() {
	return studentId;
}

public void setStudentId(String studentId) {
	this.studentId = studentId;
}
  
}
