package Composite.Baeldung.composite;

import java.util.ArrayList;
import java.util.List;

import Composite.Baeldung.component.Department;

public class HeadDepartment extends Department{
	
	public HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<Department>();
	}
	
	@Override
	public void printDepartamentName() {
		System.out.println(id + ": " + name);
		for(Department department : childDepartments)
			department.printDepartamentName();
	}
	
	@Override
	public void add(Department department) {
		childDepartments.add(department);
	}
	
	@Override
	public void remove(Department department) {
		childDepartments.remove(department);
	}
	
	private Integer id;
	private String name;
	private List<Department> childDepartments;
}
