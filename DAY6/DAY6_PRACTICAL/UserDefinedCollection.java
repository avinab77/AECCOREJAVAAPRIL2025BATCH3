package COLLECTION;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class UserDefinedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Product> arr=new ArrayList<Product>();
Product p1=new Product("P1","TV",5,25000.00,"SAMSUNG");
Product p2=new Product("P2","TAB",2,22000.00,"HP");
Product p3=new Product("P3","MOBILE",12,12000.00,"SAMSUNG");
Product p4=new Product("P4","LAPTOP",15,45000.00,"HP");
Product p5=new Product("P5","CONVECTION",9,20000.00,"IFB");
Product p6=new Product("P6","REFRIGERATOR",2,27000.00,"LG");
arr.add(p1);
arr.add(p2);
arr.add(p3);
arr.add(p4);
arr.add(p5);
arr.add(p6);
System.out.println("DISPLAY ALL PRODUCT DETAILS");
System.out.println("======================================");
for(Product p:arr)
{
	//System.out.println(p.getPid()+"==>"+p.getPname()+"==>"+p.getPqty()+"===>"+p.getPrice()+"==>"+p.getCompnm());
    System.out.println(p);
}
System.out.println("FIND OUT THOSE PRODUCT WHOSE COMPNAY NAME IS SAMSUNG");
System.out.println("=======================================");
Predicate<Product> pd1=p->p.getCompnm().equals("SAMSUNG");
for(Product ps:arr)
{
	if(pd1.test(ps))
	{
		System.out.println(ps);
	}
}
System.out.println("FIND OUT THOSE PRODUCT WHOSE PRICE > 12000.00");
System.out.println("======================================");
Predicate<Product> pd2=p->p.getPrice()>12000.00;
for(Product ps1:arr)
{
	if(pd2.test(ps1))
	{
		System.out.println(ps1);
	}
}
System.out.println("FIND OUT THOSE PRODUCT NAME SAMSUNG AND PRICE>12000.00");
System.out.println("=======================================");
for(Product ps2:arr)
{
	if(pd1.and(pd2).test(ps2))
	{
		System.out.println(ps2);
	}
}
System.out.println("PRINT THE TOTAL SALES:PQTY*PRICE");
System.out.println("========================================");
double totalsales=0.0;
Function<Product,Double> fn=p->p.getPqty()*p.getPrice();
for(Product pst:arr)
{
	totalsales=totalsales+fn.apply(pst);
}
System.out.println("TOTAL SALES:"+totalsales);
arr.stream().filter(p->p.getCompnm().equals("SAMSUNG")).forEach(System.out::println);
arr.stream().forEach(System.out::println);
	}

}
