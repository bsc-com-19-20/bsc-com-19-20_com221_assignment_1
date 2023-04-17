public class Person {
	private String Name;
	private String Address;
	private String Phone;
	private String Email;

	public Person() {
		this("Unknown", "Unknown", "Unknown", "Unknown");
	}

	public Person(String name, String address, String phone, String email) {
		this.Name = name;
		this.Address = address;
		this.Phone = phone;
		this.Email = email;
	}

	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public String getPhone() {
		return Phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String toString() {
		return "\nName: " + Name + "\nAddress: " + Address +
				"\nPhone number: " + Phone + "\nEmail address: " + Email;
	}
}