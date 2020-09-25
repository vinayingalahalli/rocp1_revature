package absstractclass_demo;

public class EmsMain {

	public static void main(String[] args) {
	
		EMS abcEms=new AbcEmployer();
		abcEms.createEmployee();
		abcEms.getEmployee();
		abcEms.updateEmployee();
		abcEms.commonEmployeeBenifits();
		abcEms.deleteEmployee();
		
		EMS revatureEms=new RevatureEmployee();

	}

}
