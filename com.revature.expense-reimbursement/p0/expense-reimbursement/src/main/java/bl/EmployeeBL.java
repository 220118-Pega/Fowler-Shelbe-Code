package bl;

import dl.DBRepository;
import dl.IRepository;
import models.Employee;

public class EmployeeBL implements IEmployeeBL {
	private IRepository repo;
	
	
	public EmployeeBL(DBRepository dbRepository) {
		// TODO Auto-generated constructor stub
	}

	public EmployeeBL() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Object getTicketById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}


		
	}

	
		
	