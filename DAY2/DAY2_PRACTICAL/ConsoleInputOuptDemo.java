package OOPS;
import java.util.*;
public class ConsoleInputOuptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER YOUR NAME");
  String name=sc.next();
  System.out.println("NAME IS:"+name);
  System.out.println("ENTER YOUR AGE");
  int age=sc.nextInt();
  System.out.println("AGE IS:"+age);
  System.out.println("ENTER THE SALARY");
  double sal=sc.nextDouble();
  System.out.println("YOUR SALARY IS:"+sal);
	}

}
