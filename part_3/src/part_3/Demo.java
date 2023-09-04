package part_3;


public class Demo {

      int i=30;
      int j=25;
      public void m1()
      {
    	  System.out.println("1st demo class");
      }
}

class mik extends Demo
{
    int a=20;
    static double e=36;
    public void m2()
    {
    	System.out.println("2nd demo 2 class");
    }
}

class sid
{
	public static void main(String [] args)
	{
		mik d=new mik();
		d.m2();
	}
}
