import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<>();
		array.add("Apple");
		array.add("Apple");
		array.add("Oracle");
		array.add(1, "Apache");
		array.add("JBoss");

		System.out.println("--Traversing over collection using for-loop");
		for (int i = 0; i < array.size(); i++)
			System.out.println(array.get(i));
		System.out.println("--Traversing over collection using iterator");

		Iterator<String> itr = array.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("--Traversing over collection using for-each");
		for (String elem : array)
			System.out.println(elem);

		LinkedList<String> lst = new LinkedList<>();

		lst.add("Google");
		lst.add("Iphone");
		lst.add("Xiaomi");

		array.addAll(lst);
		System.out.println("--Traversing over updated colection using for-each");
		for (String elem : array)
			System.out.println(elem);
		
		HashSet<String> set= new HashSet<>(array);
		System.out.println("--Traversing over hash using for-each");
		for (String elem : set)
			System.out.println(elem);
		
		TreeSet<String> tree= new TreeSet<>(set);
		System.out.println("--Traversing over tree using for-each");
		for (String elem : tree)
			System.out.println(elem);
		System.out.println("--Traversing over tree using foreach java8");
		tree.forEach(System.out::println);
		
		
		

	}

}
