package COLLECTION;

import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] x=new int[3];
x[0]=100;
x[1]=200;
x[2]=300;
System.out.println(x[0]);
String[] names= {"SUMAN","ANUP","RAMAN"};
//TRAVERSE THE ELEMENTS USING FOR LOOP
for(int i=0;i<names.length;i++)
{
	System.out.println(names[i]);
}
//TRAVERSE THE ELEMENTS USING FOREACH LOOP
for(String s:names)
{
	System.out.println(s);
}
//TRAVESE THE ELEMENT USING STREAM API
Stream.of(names).forEach(System.out::println);
	}

}
