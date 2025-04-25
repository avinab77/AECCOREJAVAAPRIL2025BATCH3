package THREAD;
class TestThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=100;i++)
			{
				System.out.println("THREAD:"+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestThread ts1=new TestThread();
  ts1.setDaemon(true);
  ts1.start();
  try
	{
		for(int i=101;i<=150;i++)
		{
			System.out.println("MAIN THREAD:"+i);
			Thread.sleep(100);
		}
	}
	catch(InterruptedException ie)
	{
		ie.printStackTrace();
	}
	}

}
