import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DemoLocalDate {
	
	public static void main(String[] args) {
		
		LocalDate localDate1=LocalDate.now();
		System.out.println(localDate1);
		
		LocalDate localDate2=LocalDate.of(2017,05,10);
		System.out.println(localDate2);
		
		LocalDate localDate3=LocalDate.parse("2015-03-12");
		System.out.println(localDate3);
		
		LocalDate tomorrow=LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate previousMonth=localDate3.minus(1,ChronoUnit.MONTHS);
		System.out.println(previousMonth);
		
		System.out.println(localDate2.getDayOfWeek());
		System.out.println(localDate1.getMonth());
		System.out.println(LocalDate.now().isLeapYear());
		System.out.println(LocalDate.MAX);
	}

}
