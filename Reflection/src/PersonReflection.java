import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {
	public static void main(String[] args) {
		Person p = new Person("Polo", 21);
		System.out.println(p);
		Class pc = p.getClass();
		System.out.println(pc);

		Constructor[] constructors = pc.getConstructors();
		System.out.println("--Constructors of " + pc);
		for (Constructor c : constructors)
			System.out.println(c);

		Method[] methods = pc.getMethods();

		System.out.println("--Methods of" + pc);
		for (Method m : methods) {
			System.out.println(m);
		}

		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("-- Declared methods of " + pc);
		for (Method dm : decMethods) {
			System.out.println(dm);

			Field[] fields = pc.getDeclaredFields();
			System.out.println("---Fields of" + pc);
			for (Field f : fields)

				System.out.println(f);
		}

	}

}
