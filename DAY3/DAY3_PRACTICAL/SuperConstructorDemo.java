package OOPS;
class Patient
{
	public String pid;
	public String pname;
	public int age;
	public Patient(String pid,String pname,int age)
	{
		this.pid=pid;
		this.pname=pname;
		this.age=age;
	}
	public void pdetails()
	{
		System.out.println("PATIENT ID:"+pid);
		System.out.println("PATIENT NAME:"+pname);
		System.out.println("AGE:"+age);
	}
}
class LabTest extends Patient
{
	public String testnm;
	public String testdt;
	public double price;
	public LabTest(String pid,String pname,int age,String testnm,String testdt,double price)
	{
		super(pid,pname,age);//CALLING SUPER CLASS CONSTRUCTOR
		this.testnm=testnm;
		this.testdt=testdt;
		this.price=price;
	}
	public void testdetails()
	{
		System.out.println("TESTNAME:"+testnm);
		System.out.println("DATE OF TEST:"+testdt);
		System.out.println("PRICE:"+price);
	}
}
public class SuperConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LabTest lb=new LabTest("PT1","RAVI",25,"X_RAY","23/04/2025",1000.00);
 lb.pdetails();
 lb.testdetails();
	}

}
