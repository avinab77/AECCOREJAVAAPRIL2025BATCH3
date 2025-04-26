package COLLECTION;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //ArrayList arr=new ArrayList();//without generics
	Vector arr=new Vector();
 //Integer n=new Integer(10);//wrapper class
 arr.add(10);
 arr.add(5);
 arr.add(20);
 arr.add(15);
arr.add(15.5);
 arr.add("RAVI");
 arr.add(15);
 System.out.println(arr);
 arr.add(2,"RUPAM");
 System.out.println(arr);
 arr.remove(2);
 System.out.println(arr);
 //Collections.sort(arr);
 System.out.println(arr);
 System.out.println("TRAVERSE THE ELEMENTS USING FOREACH LOOP");
 for(Object o:arr)
 {
	 System.out.println(o);
 }
	}

}
