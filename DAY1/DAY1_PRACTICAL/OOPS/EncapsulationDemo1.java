package OOPS;
class Customer
{
	private String cid="C1";
	private String cname="SUMAN";
	private String cphno="65656";
	public void show()
	{
		System.out.println("CID:"+cid);
		System.out.println("NAME:"+cname);
		System.out.println("PHONE NO:"+cphno);
	}
}
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Customer cs=new Customer();
 cs.show();
	}

}
