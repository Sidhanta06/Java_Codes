package part_3;

public class User {
 String uname;
 int cno;

 public User(String uname, int cno) {
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
