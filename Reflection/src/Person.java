import java.security.BasicPermission;

public class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("Private Method") {
		});
		System.out.println("Name:" + name + "\t Age" + age);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:" + name + "\t Age" + age;
	}

}
