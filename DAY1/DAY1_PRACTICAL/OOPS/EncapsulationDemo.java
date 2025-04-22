package OOPS;
class Furniture
{
	private double length=100.00;//isntance variable
	private double width=200.00;
	private double height=300.00;
	public void volume()
	{
		double vol;//local variable
		vol=length*width*height;
		System.out.println("VOLUME:"+vol);
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("HELLO");
		Furniture chair=new Furniture();//OBJECT CREATION
		chair.volume();
	}

}
