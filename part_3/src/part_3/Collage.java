package part_3;

public class Collage {
	String colname;
	String location;
	String Pname;
	int nofplacement;

	public Collage(String colname,String location,String Pname,int nofplacement) {
		super();
		this.colname=colname;
		this.location=location;
		this.Pname=Pname;
		this.nofplacement=nofplacement;
		
	}
	@Override

	public String  toString() {
		return "Collage name : "+colname+"\n"+"Collage Location : "+location+"\n"+"Principal name : "+Pname+"\n"+"No of Placement : "+nofplacement+"\n"+"**************************************"+"\n";

	}

}
