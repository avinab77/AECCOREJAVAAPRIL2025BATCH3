package OOPS;
class UseStatic
{
	public static int x=25;
	public static void display()
	{
		System.out.println("X:"+x);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //UseStatic us=new UseStatic();
 //us.display();
		//UseStatic.display();
		System.out.println(UseStatic.x);
	}

}
