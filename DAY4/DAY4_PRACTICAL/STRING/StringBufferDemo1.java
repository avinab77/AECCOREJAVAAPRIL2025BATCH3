package STRING;
import java.lang.Object;
public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StringBuffer sb1=new StringBuffer("RAVI");
  StringBuffer sb2=new StringBuffer("RAVI");
  String s1=new String("RAMAN");
  String s2=new String("RAMAN");
  System.out.println(s1==s2);
  System.out.println(s1.equals(s2));
  System.out.println(sb1==sb2);
  System.out.println(sb1.equals(sb2));
  
	}

}
