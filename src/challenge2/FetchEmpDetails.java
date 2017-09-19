package challenge2;

public class FetchEmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeFactory _factory = new EmployeeFactory();
		_factory.createEmpRecord("333", "AAA", "4444555666", "CA, United States");
		for(Employee emp : _factory.getEmployees()) {
			System.out.println("Employee Details:\n" + 
								"\tID = " + emp.getId() + 
								"\tName = "+emp.getName() + 
								"\tPhone = " + emp.getPhone() + 
								"\tAddress = " +emp.getAddress() + "\n");
		}

	}

}
