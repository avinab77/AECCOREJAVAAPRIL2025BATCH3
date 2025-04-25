package STRING;
public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="";
 System.out.println(s1.isEmpty());
 String s2="abcabcabcabc";
 System.out.println(s2.replace('c','d'));
 String s3="TEST";
 System.out.println("PRINTING FIRST INDEX OF T");
 System.out.println(s3.indexOf('T'));
 System.out.println("PRINTING THE LAST INDEX OF T");
 System.out.println(s3.lastIndexOf('T'));
 String s4=" DELHI ";
 System.out.println(s4);
 System.out.println(s4.trim());
 String s5="BANGALORE";
 System.out.println(s5.substring(5,7));
 System.out.println(s5.charAt(3));
 String s6="chennai";
 System.out.println(s6.toUpperCase());
 String s7="MUMBAI";
 System.out.println(s7.toLowerCase());
 String msg="HELLO,HOW ARE YOU,I AM FINE";
     String m[]=msg.split(",");
     for(int i=0;i<m.length;i++)
     {
    	 System.out.println(m[i]);
     }
        
    
	}

}
