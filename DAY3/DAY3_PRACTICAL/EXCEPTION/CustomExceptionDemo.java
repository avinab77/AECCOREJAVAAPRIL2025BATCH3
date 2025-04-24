package EXCEPTION;
class Account
{
	public String accno="100";
	public void checkAccount(String accno)
	{
		try
		{
		   if(accno.equals(this.accno))
		   {
			System.out.println("ACCOUNT EXISTS");
		    }
		  else
		   {
			  AccountNotException ac=new AccountNotException();
			  throw ac;
		    }
		}
		catch(AccountNotException ae)
		{
			ae.printStackTrace();
		}
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Account acn=new Account();
  acn.checkAccount("101");
	}

}
