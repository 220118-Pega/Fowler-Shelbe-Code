package bl;

import models.Employee;

public interface IEmployeeBL {
	void addEmployee (Employee employee);

	void updateEmployee(Employee employee) throws Exception;
}