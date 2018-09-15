
public class Person implements Comparable<Person> {

	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}

	@Override
	public String toString() {
		return "Name:"+name+"\tAge"+age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person p) {
		
		return this.name.compareTo(p.name);
		
	}

}


