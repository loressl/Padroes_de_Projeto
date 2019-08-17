package Composite.Baeldung.leafs;

import Composite.Baeldung.component.Department;

public class FinancialDepartment extends Department{
	
	public FinancialDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	} 
	
	@Override
	public void printDepartamentName() {
		System.out.println(getClass().getSimpleName());
	}
	
	private Integer id;
	private String name;
}
