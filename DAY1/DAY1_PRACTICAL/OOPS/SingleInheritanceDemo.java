package OOPS;
class Parent
{
	public int x=25;
}
class Child extends Parent //single inheritance
{
	public int y=60;
	public void add()
	{
		int c;
		c=x+y;
		System.out.println("RESULT:"+c);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Child ch=new Child();
 ch.add();
	}

}
