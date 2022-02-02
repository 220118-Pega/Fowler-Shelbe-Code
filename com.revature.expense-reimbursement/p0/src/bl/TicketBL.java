package bl;

import java.util.List;

import dl.DBRepository;
import dl.IRepository;
import models.Ticket;
import ui.Status;

public class TicketBL implements ITicketBl{
	private IRepository repo;
	
	public TicketBL(DBRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Ticket> getTicket() {
		// TODO Auto-generated method stub
		return repo.getTickets();
	}

	@Override
	public List<Ticket> getTicketByEmployeeId(int id) {
		// TODO Auto-generated method stub
		return repo.getTicketsByEmloyeeId(id);
	}

	@Override
	public List<Ticket> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return repo.filterStatus(status);
	}

	@Override
	public Ticket getTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo.getTicketById(id);
	}

	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		repo.addTicket(ticket);
	}

	@Override
	public void updateTicket(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		repo.updateTicket(ticket);
	}

	public static void updateSolution(Integer employeeId, Integer newUpVote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getEmployeeById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getTicketByEmployeeId(int employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTicket(Ticket ticket) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}