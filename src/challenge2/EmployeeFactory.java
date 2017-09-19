package challenge2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFactory {
	
	static List<Employee> emp_list = new ArrayList<Employee>();
	
	Employee createEmpRecord(String id,String name, String phone, String address ) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setPhone(phone);
		emp.setAddress(address);
		emp_list.add(emp);
		return emp;
		
	}
	public List<Employee> getEmployees() {
		Employee emp1 = new Employee("111", "XXX", "9999888777", "Tx, United States");
		emp_list.add(emp1);
		createEmpRecord("222", "YYY", "1111222333", "NY, United States");
		return emp_list;
		
	}
}
