import java.util.TreeSet;

public class SortedPerson {
public static void main(String[] args) {
	
	
	PersonComparator pc= new PersonComparator();
	TreeSet<Person> persons=new TreeSet<>();
	persons.add(new Person("Polo",21));
	persons.add(new Person("Lili",19));
	persons.add(new Person("Mili",20));

	for (Person person : persons) {
		System.out.println(person);
		
	}
}
}
