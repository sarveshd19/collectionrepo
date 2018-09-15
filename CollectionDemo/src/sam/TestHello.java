package sam;

public class TestHello {
	public static void main(String[] args) {

		Hello h = new Hello() {
			public String sayHello(String name) {
				return "Hello " + name;

			}

		};
		System.out.println(h.sayHello("AIQ"));
		Hello hi = (name) -> "Hola  " + name;
		System.out.println(hi.sayHello("AIQ"));
		System.out.println(hi);
		Hello.greet();
		
		h.seeOff();
	}

}
