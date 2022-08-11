package br.com.udemy.prototype.examples.employees;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> employeesList;

	public Employees() {
		employeesList = new ArrayList<>();
	}

	public Employees(List<String> list) {
		employeesList = list;
	}

	public void loadData() {
		employeesList.add("Hector");
		employeesList.add("Mary");
		employeesList.add("Phill");
		employeesList.add("Jason");
	}

	public List<String> getEmployeesList() {
		return employeesList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<>();
		for (String name : getEmployeesList()) {
			tempList.add(name);
		}
		return new Employees(tempList);
	}
}
