package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate ld=LocalDate.now();//YYYY-MM-DD
System.out.println(ld);
LocalDateTime ldt=LocalDateTime.now();//YYYY-MM-DD-HH-MM-SEC-MS
System.out.println(ldt);
int dd=ldt.getDayOfMonth();
int mm=ldt.getMonthValue();
int yr=ldt.getYear();
int hh=ldt.getHour();
int min=ldt.getMinute();
int sec=ldt.getSecond();
System.out.println(dd+"/"+mm+"/"+yr+":"+hh+":"+min+":"+sec);
LocalDate dob=LocalDate.of(1987,02,20);
LocalDate currdt=LocalDate.now();
Period p=Period.between(dob, currdt);
int yrs=p.getYears();
int month=p.getMonths();
int day=p.getDays();
System.out.println("YOUR AGE IS:"+("YEAR:"+yrs+"MONTH:"+month+"DAYS:"+day));

	}

}
