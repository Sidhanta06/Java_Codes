package string;

import java.util.Stack;

public class stack {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Stack s=new Stack();
		Stack s1=new Stack();
		s.push(new car("BMW","Black","ZX1",15,52));
		s.push(new car("Suzuki","Gray","Waganor",22,12));
		s.push(new car("Honda","Black","Jazz",25,15));
		s.push(new car("Huyndai","Yellow","Verna",28,11));
		s.push(new car("Mahindra","Gray","Thar",15,22));
		s.push(new car("Tata","Black","Punch",12,14));
		s.push(new car("Porsche","Green","Macan",8,82));
		s.push(new car("Renault","Red","Kiger",24,17));
		s.push(new car("Toyota","White","Innova",18,25));
		s.add(new car("Datsun","Blue","GO+",32,9));
		
	  while (s.size()!=5) {
		  s1.add(s.pop());
	}
	  System.out.println(s);
	  System.out.println(s1);
	
	}
} 
