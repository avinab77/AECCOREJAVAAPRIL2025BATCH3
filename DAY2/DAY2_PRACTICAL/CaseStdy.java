package OOPS;
class Percel
{
	class Destination
	{
		public void desti(String loc)
		{
			System.out.println("DESTINATION:"+loc);
		}
	}
	class Contents
	{
		public void weight(double w)
		{
			System.out.println("WEIGHT IS:"+w);
		}
	}
}
public class CaseStdy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Percel p=new Percel();
  Percel.Destination ds=p.new Destination();
  Percel.Contents cn=p.new Contents();
  ds.desti("KOLKATA");
  cn.weight(25.5);
	}

}
