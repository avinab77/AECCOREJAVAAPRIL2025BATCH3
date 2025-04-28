package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PfIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Predicate<Integer> p=i->i%2==0;
  System.out.println(p.test(10));
  System.out.println(p.test(5));
  Function<String,Integer> f1=s->s.length();
  System.out.println(f1.apply("RANJANA"));
  Function<String,String> f2=s->s.toUpperCase();
  System.out.println(f2.apply("ajoy"));
  Consumer<String> c=s->System.out.println(s);
  c.accept("PREDEFINED FUNCTIONAL INTERFACE");
  Supplier<LocalDate> sp=()->LocalDate.now();
  System.out.println(sp.get());
  
		  
	}

}
