import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		//Loads class file manually
		Class pc = Class.forName("Person");
		
		Object o1 = pc.newInstance();
		System.out.println(o1);
		
		//Fetching constructor by params
		Constructor cstr = pc.getConstructor(String.class,int.class);
		Object o2 = cstr.newInstance("Polo",21);
		System.out.println(o2);
		
		Method mth=pc.getDeclaredMethod("print",null);
		mth.setAccessible(true);
		mth.invoke(o2,null);
		
	}

}
