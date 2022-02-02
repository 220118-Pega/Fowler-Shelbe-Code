package bl;

import dl.IRepository;
import models.Employee;

public class EmployeeBL implements IEmployeeBL {
	private IRepository repo;
	
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		
		
	}


		
	}

	
		
	