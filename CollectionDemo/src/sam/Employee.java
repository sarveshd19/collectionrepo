package sam;

public interface Employee {

	
	int getDeptNo();
	
	default void showDepartment() {
		System.out.println(getDeptNo()==10 ?"Sales":"Marketing");
	}
}
