package bl;
public class EmployeeBL implements IEmployeeBL {
	private IRepository repo;
	
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.addEmployee(employee);
		
	}

	@Override
	public void apdateEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		
		
	}