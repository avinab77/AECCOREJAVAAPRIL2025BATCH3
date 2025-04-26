package COLLECTION;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> lt=new LinkedList<String>();
lt.add("ALOKE");
lt.add("DIPAYAN");
lt.add("RAHUL");
lt.add("RAMAN");
lt.add("SUMAN");
lt.add("ALOKE");
lt.add(2,"ANNANYA");
lt.addFirst("JAYANTA");
lt.addLast("AJOY");
for(Object o:lt)
{
	System.out.println(o);
}
	}

}
