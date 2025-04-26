package COLLECTION;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stack<String> lt=new Stack<String>();
  lt.add("ALOKE");
  lt.add("DIPAYAN");
  lt.add("RAHUL");
  lt.add("RAMAN");
  lt.add("SUMAN");
  lt.add("ALOKE");
  lt.push("AYAN");
  
  System.out.println("TOPMOST ELEMENT:"+lt.peek());
  for(Object o:lt)
  {
	  System.out.println(o);
  }
  lt.pop();
  for(Object o:lt)
  {
	  System.out.println(o);
  }
	}

}
