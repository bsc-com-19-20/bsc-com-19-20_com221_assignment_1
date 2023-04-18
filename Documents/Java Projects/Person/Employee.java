public class Employee
		extends Person {
	private int Office;
	private double Salary;
	private MyDate DateHired;

	public Employee(String name, String address, String phone,
			String email, int office, double salary) {
		super(name, address, phone, email);
		this.Office = office;
		this.Salary = salary;
		this.DateHired = new MyDate();
	}

	public int getOffice() {
		return Office;
	}

	public String getSalary() {
		return String.format("%.2f", Salary);
	}

	public String getDateHired() {
		return DateHired.getMonth() + "/" + DateHired.getDay()
				+ "/" + DateHired.getYear();
	}

	public void setOffice(int office) {
		this.Office = office;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public void setDateHired() {
		DateHired = new MyDate();
	}

	public String toString() {
		return super.toString() + "\nOffice: " + Office +
				"\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}