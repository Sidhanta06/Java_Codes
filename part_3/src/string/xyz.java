package string;

import java.util.LinkedList;
import java.util.Stack;

public class xyz {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		LinkedList l1=new LinkedList();
		l.add(1);
		l.add(10);
		l.add(7);
		l.add(5);
		l.add(2);
		l.add(3);
		l.add(15);
		l.add(6);
		l.add(20);
		l.add(12);
		l.add(25);
		l.add(13);
		l.add(18);
		l.add(59);
		l.add(30);
		l.add(40);
		//System.out.println(l);
		
		for (Object object : l) {
			int l2=(Integer)object;
			if (l2%5==0) {
				System.out.println(l2+" is multiple of 5");
			}
			
		}
		for (Object object : l) {

			int l3=(Integer)object;
			
			int count=0;
			
			for (int i = 1; i <=l3; i++) {
				if (l3%i==0) {
					count++;
				}
			}
			if (count==2) {
				l1.add(l3); 
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("Array list \n"+l);
		System.out.println("----------------------------------------");
		l.removeAll(l1);
		System.out.println("Prime number removed \n"+l);
		
	}
}
