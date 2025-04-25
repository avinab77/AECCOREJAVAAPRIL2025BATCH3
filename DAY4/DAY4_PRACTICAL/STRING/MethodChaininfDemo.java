package STRING;

public class MethodChaininfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb1=new StringBuffer();
sb1.append("JAYANTA").reverse().delete(1,2).reverse();
System.out.println(sb1);
StringBuffer sb2=new StringBuffer();
sb2.append("BANGALORE").reverse();
System.out.println(sb2);
	}

}
