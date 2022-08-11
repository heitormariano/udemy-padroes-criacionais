package br.com.udemy.prototype.examples.employees;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees empOriginal = new Employees();
		empOriginal.loadData();

		Employees empClone1 = (Employees) empOriginal.clone();
		Employees empClone2 = (Employees) empOriginal.clone();

		List<String> originalList = empOriginal.getEmployeesList();
		List<String> clone1List = empClone1.getEmployeesList();
		List<String> clone2List = empClone2.getEmployeesList();

		// manipulating elements of cloned lists
		clone1List.add("Mark");
		clone2List.remove("Hector");

		// printing elements from lists
		System.out.println("Original list:");
		originalList.forEach(System.out::println);
		System.out.println();

		System.out.println("Clone 1 list:");
		clone1List.forEach(System.out::println);
		System.out.println();

		System.out.println("Clone 2 list:");
		clone2List.forEach(System.out::println);
		System.out.println();
	}
}
