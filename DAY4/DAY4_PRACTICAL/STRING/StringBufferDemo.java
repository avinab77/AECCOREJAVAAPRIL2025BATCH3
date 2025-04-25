package STRING;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1=new String("AJOY");
 s1.concat("MANAGER");
 s1.concat("CTS");
 System.out.println(s1);
 StringBuffer sb1=new StringBuffer("AJOY");
 sb1.append("MANAGER");
 sb1.append("CTS");
 System.out.println(sb1);
 String st=new String("RAVI");
 System.out.println(st.length());
StringBuffer sds=new StringBuffer();
System.out.println("CAPACITY:"+sds.capacity());
System.out.println("LENGTH:"+sds.length());
 sds.append("abcdefghijklmnop");
 System.out.println("CAPACITY:"+sds.capacity());
 System.out.println("LENGTH:"+sds.length());
 sds.append("Q");
 System.out.println("CAPACITY:"+sds.capacity());//(CURRENT CAPACITY+1)*2
 System.out.println("LENGTH:"+sds.length());
	}

}
