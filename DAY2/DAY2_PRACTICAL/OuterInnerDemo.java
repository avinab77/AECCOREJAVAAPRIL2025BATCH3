package OOPS;

import OOPS.Outer.Inner;

class Outer
{
	private int out_x=25;
	class Inner
	{
		public int inn_y=60;
		public void add()
		{
			System.out.println("RESULT:"+(out_x+inn_y));
		}
	}
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		Outer.Inner inn=out.new Inner();
		inn.add();

	}

}
