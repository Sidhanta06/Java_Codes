package java_project;

public class User {
 String uname;
 long cno;

 public User(String uname, long cno) {
	super();
	this.uname = uname;
	this.cno = cno;
}
 
 public void detailsofUser()
 {
	 System.out.println("*** Details of User ****");
	 System.out.println("User Name : "+uname);
	 System.out.println("Contact number : "+cno);
 }
 
}
