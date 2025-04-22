package OOPS;
class Parent12
{
	public void show()
	{
		System.out.println("I AM IN PARENT CLASS");
	}
}
class Child12 extends Parent12
{
	public void show()
	{
		System.out.println("I AM IN CHILD CLASS");
		super.show();
	}
}
public class MethodOverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Child12 ch=new Child12();
  ch.show();
	}

}
