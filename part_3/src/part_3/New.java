package part_3;

public class New {

	public static void main(String[] args) {
		mik2 m=new mik2();
		
		d x=new mik2();
		mik2 y=(mik2)x;
		System.out.println(m.i);
		System.out.println(m.j);
		m.m2();
		m.m1();
		System.out.println(y.a);
		
	
	}

}

class mik2 extends d
{
	    int a=20;
	    static double e=36;
	    public void m2()
	    {
	    	System.out.println("2nd demo 2 class");
	    }}

class d
{
	int i=30;
    int j=25;
    public void m1()
    {
  	  System.out.println("1st demo class");
    }	
}