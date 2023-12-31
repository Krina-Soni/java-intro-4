package lesson02;

/**
 * Created by Vladimir Trandafilov on 27.02.2019.
 */
public class Person {

	private String firstName;
	private String secondName;
	private int age;

	public Person(String firstName, String secondName, int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Person person = (Person) o;

		if (age != person.age)
			return false;
		if (!firstName.equals(person.firstName))
			return false;
		return secondName.equals(person.secondName);
	}

	public int hashCode() {
		int result = firstName.hashCode();
		result = 31 * result + secondName.hashCode();
		result = 31 * result + age;
		return result;
	}

	public String toString() {
		return "Person{" + "firstName='" + firstName + '\'' + ", secondName='" + secondName + '\'' + ", age=" + age
				+ '}';
	}
}
