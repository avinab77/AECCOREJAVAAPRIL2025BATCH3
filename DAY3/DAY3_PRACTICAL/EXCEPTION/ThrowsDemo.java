package EXCEPTION;
class Calcs
{
	public int x=25;
	public int y=0;
	public void result() throws ArithmeticException,Exception
	{
			//calle environment
		  int z;
		   z=x/y;
		   System.out.println("RESULT IS:"+z);
	
		
	}
	
}
public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception {
		// TODO Auto-generated method stub
 Calcs c=new Calcs();
 c.result();//caller environment
	}

}
