package OOPS;
class Lecturer implements Speak,Speak1
{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
	System.out.println("SAYS ABOUT SOME TOPIC");	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("JAVA");
	}
	
}
class Priest implements Speak
{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("SAYS ABOUT RELIGION");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Lecturer lt=new Lecturer();
  Priest prs=new Priest();
  lt.talk();
  lt.display();
  prs.talk();
	}

}
