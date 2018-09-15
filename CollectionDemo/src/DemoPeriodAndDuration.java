import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DemoPeriodAndDuration {

	public static void main(String[] args) {
		
		LocalDate initDate = LocalDate.now();
		System.out.println(initDate);
		LocalDate liveDate = initDate.plus(Period.ofDays(20));
		System.out.println(liveDate);
		
		System.out.println(Period.between(initDate, liveDate).getDays());
		System.out.println(ChronoUnit.DAYS.between(initDate, liveDate));
		
		LocalTime initTime = LocalTime.now();
		System.out.println(initTime);
		
		LocalTime dinnerTime= initTime.plus(Duration.ofHours(6));
		System.out.println(dinnerTime);
		System.out.println(Duration.between(initTime, dinnerTime));
		System.out.println(ChronoUnit.MINUTES.between(initTime, dinnerTime));
		
		
	}
	
}
