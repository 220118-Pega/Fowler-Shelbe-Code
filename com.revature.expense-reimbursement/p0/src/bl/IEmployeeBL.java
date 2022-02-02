package bl;

import models.Employee;

public interface IEmployeeBL {
	void addEmployee (Employee employee);
	void apdateEmployee(Employee employee) throws Exception;
}