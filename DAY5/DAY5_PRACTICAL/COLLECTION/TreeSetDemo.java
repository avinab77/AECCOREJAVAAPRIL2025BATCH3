package COLLECTION;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ts=new TreeSet<String>(new TestComparator());
ts.add("DIBENDU");
ts.add("ALOKE");
ts.add("AYAN");
ts.add("RAVI");
ts.add("JAYANATA");
ts.add("BHASKAR");
for(Object o:ts)
{
	System.out.println(o);
}
	}

}
