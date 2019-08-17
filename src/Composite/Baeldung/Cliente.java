package Composite.Baeldung;

import Composite.Baeldung.component.Department;
import Composite.Baeldung.composite.HeadDepartment;
import Composite.Baeldung.leafs.FinancialDepartment;
import Composite.Baeldung.leafs.SalesDepartment;

public class Cliente {

	public static void main(String[] args) {
		Department salesDepartment = new SalesDepartment(1, "Sales department");
		Department finacialDepartment = new FinancialDepartment(2, "Financial department");
		
		HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
		
		headDepartment.add(salesDepartment);
		headDepartment.add(finacialDepartment);
		
		headDepartment.printDepartamentName();

	}

}
