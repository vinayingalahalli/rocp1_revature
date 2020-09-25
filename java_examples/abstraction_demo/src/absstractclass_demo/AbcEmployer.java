package absstractclass_demo;

public class AbcEmployer extends EMS {

	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Abc Employee created in Oracle DB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Abc Employee got updated in Oracle DB");
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Abc Employee got deleted from Oracle DB");
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Abc Employee retrived from Oracle DB");
	}

}
