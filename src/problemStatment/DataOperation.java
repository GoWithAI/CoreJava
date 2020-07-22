package problemStatment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataOperation {

	static class Employee{
		
		private Integer id;
		private String name;	
		private String department;
		private Integer salary;
		
		public Employee() {
			
		}
		
		public Employee(Integer id, String name, String department, Integer salary) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
	}
	
	public static Map<String,Integer> processData(ArrayList<String> array) {
       
    	Map<String,Integer> retVal = new HashMap<>();
    	
    	List<Employee> emps = new ArrayList<>();
    	
    	for (String arr : array) {
    		
    		List<String> employeeData = Stream.of(arr.split(",")).collect(Collectors.toList());
    		
    		Employee employee = new Employee(Integer.valueOf(employeeData.get(0).trim()),
    				String.valueOf(employeeData.get(1)), String.valueOf(employeeData.get(2)), Integer.valueOf(employeeData.get(3).trim()));
    		
    		emps.add(employee);
		}
    	
    	for (Employee employee : emps) {
			
    		if(retVal.containsKey(employee.getDepartment()) && retVal.get(employee.getDepartment()) != null && employee.getSalary() > retVal.get(employee.getDepartment())) {
    			retVal.put(employee.getDepartment(), employee.getSalary());
    			continue;
    		}
    		
    		retVal.put(employee.getDepartment(), employee.getSalary());
		}
    	
        return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }

}
/*
Core Java Problem Statement :

Salary of Newest Member of Dept
In this problem, you have to modify an existing Java program that reads in some employee data, and does some processing on it.

The input is being read in from a file called input.txt, in this format:

22, Rajan Anand, Engineering, 1600000
23, Swati Patil, Testing, 800000
27, Vijay Chawda, Engineering, 800000
29, Basant Mahapatra, Engineering, 600000
32, Ajay Patel, Testing, 350000
34, Swaraj Birla, Testing, 350000
Each line consists of 4 fields "Employee ID," "Name," "Department," and "Salary." Here, "Employee ID" and "Salary" are integers, while "Name" and "Department" are strings that do not contain commas or newlines.

Currently, the existing program reads the input and creates an array of String from the lines of input. Then it calls a method processData on with this array, and prints the returned data to the output file. Unfortunately, processData currently does not do anything useful - it just returns an empty Map<String,Integer>.

You have to modify processData find salary of the Employee who has the highest Employee ID in that department (because that represents the newest employee to join that department). Specifically, processData should return a Map where each key is the name of a department, and the value is the salary of the employee in that department who has the highest Employee ID.

If your program is run with the input given above, it should produce this output:

Engineering: 600000
Testing: 350000
This is because Basant Mahapatra has the highest employee ID (29) in the Engineering department and his salary is 600000, and Swaraj Birla has the highest employee ID (34) in the Testing department, and his salary is 350000.

Please make sure of the following:

Please download this Java Program, and change it to create your program, and submit your changed program as your answer
All your changes must be inside the processData method. Do not make any changes to the rest of the program
Make sure processData returns the correct value
Copy paste the entire updated program in the space below. You must submit a full, working, program. Please compile, run, and check the output of your program before submitting it.
Do not add a package declaration, and do not change the name of the class.
Answer
*/