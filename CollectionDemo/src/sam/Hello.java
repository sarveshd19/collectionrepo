package sam;

@FunctionalInterface
public interface Hello {

	String sayHello(String name);

	String toString();

	static void greet() {

		System.out.println("Howdy!");

	}

	default void seeOff() {
		System.out.println("Asta la vista");

	}

}
