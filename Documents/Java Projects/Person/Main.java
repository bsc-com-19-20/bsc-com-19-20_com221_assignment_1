
public class Main {
	public static void main(String[] args) {
		Person person = new Person("Ben", "Chanco campus",
				"0993456287", "Ben@gmail.com");

		Student student = new Student("Jack", "Matiya", "0888657435",
				"Jack@gmail.com", Student.FRESHMAN);

		Employee employee = new Employee("Joe", "Chanco campus", "0965743892",
				"Joe@gmail.com", 210, 20000);

		Faculty faculty = new Faculty("Jane", "Mponda", "08854632719",
				"Jane@gmail.com", 231, 10000, "8pm to 5pm", "Doctor");

		Staff staff = new Staff("julious", "chikanda", "0888632628",
				"Ju@gmail.com", 100, 65000, "Finance");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}