package COLLECTION;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet<String> hs=new HashSet<String>();//DATASTARUCTURE IS HASHTABLE
//LinkedHashSet<String> hs=new LinkedHashSet<String>();//DATASTUCTURE LINKEDLIST+HASHTABEL
TreeSet<String> hs=new TreeSet<String>();
hs.add("SUMAN");
hs.add("SOUMYA");
hs.add("BHASKAR");
hs.add("RIYA");
hs.add("ARNAB");
hs.add("DIPESH");
hs.add("RIYA");
for(Object o:hs)
{
	System.out.println(o);
}
	}

}
