package COLLECTION;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(10);
arr.add(30);
arr.add(50);
arr.add(60);
arr.add(30);
//arr.add("ROBIN");
for(Object o:arr)
{
	System.out.println(o);
}
	}

}
