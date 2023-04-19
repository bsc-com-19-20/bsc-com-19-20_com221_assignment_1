import java.util.GregorianCalendar;

public class MyDate {
	private int Year;
	private int Month;
	private int Day;

	MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		Year = calander.get(GregorianCalendar.YEAR);
		Month = calander.get(GregorianCalendar.MONTH);
		Day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	MyDate(int year, int month, int day) {
		this.Year = year;
		this.Month = month;
		this.Day = day;
	}

	public int getYear() {
		return Year;
	}

	public String getMonth() {
		String month = String.valueOf(Month + 1);
		return (Month < 10 ? "0" + month : month);
	}

	public String getDay() {
		String day = String.valueOf(Day);
		return (Day < 10 ? "0" + day : day);
	}

	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		Year = calander.get(GregorianCalendar.YEAR);
		Month = calander.get(GregorianCalendar.MONTH);
		Day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}
}