import java.time.LocalTime;

public class DemoLocalTime {
	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println(now);

		LocalTime fivethirty = LocalTime.parse("17:42:00");
		System.out.println(fivethirty);
		LocalTime fourten = LocalTime.of(16, 10);
		System.out.println(fourten);
		System.out.println(fivethirty.plusHours(2));
		System.out.println(fourten.getHour());

		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);

		System.out.println(LocalTime.MIDNIGHT);

	}
}
