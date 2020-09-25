package absstractclass_demo;

public abstract  class EMS {

	public abstract void createEmployee();
	public abstract void updateEmployee();
	public abstract void deleteEmployee();
	public abstract void getEmployee();
	
	public void commonEmployeeBenifits() {
		System.out.println("These benifits are common across all the Employees");
	}
}
