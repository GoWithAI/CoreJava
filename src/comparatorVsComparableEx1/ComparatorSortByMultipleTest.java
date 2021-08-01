package comparatorVsComparableEx1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSortByMultipleTest {

	public static void main(String[] args) {


		ArrayList<Employee> unsortedEmployeeList = getUnsortedEmployeeList();
		
		Comparator<Employee> thenComparing = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getI);
		Collections.sort(unsortedEmployeeList, thenComparing);
		System.out.println(unsortedEmployeeList);
	}

	private static ArrayList<Employee> getUnsortedEmployeeList(){
        ArrayList<Employee> list = new ArrayList<>();
        list.add( new Employee(2, "Lokesh", "Gupta") );
        list.add( new Employee(1, "Alex", "Gussin") );
        list.add( new Employee(5, "Neon", "Piper") );
        list.add( new Employee(3, "David", "Beckham") );
        list.add( new Employee(7, "Alex", "Beckham") );
        list.add( new Employee(6, "Brian", "Suxena") );
        list.add( new Employee(4, "Brian", "Sux") );
        
        return list;
    }
	
}
