package utilis;

import bl.IEmployeeBL;
import controllers.IController;
import io.javalin.http.Handler;


import models.Employee;

public class employeeControler implements IController {

	 
	
		private IEmployeeBL employeeBL;
		public employeeControler (IEmployeeBL employeeBL) 
		{
			this.employeeBL = employeeBL;
		}
		
		
		public Handler getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		public Handler getById() {
			// TODO Auto-generated method stub
			return ctx -> {
				ctx.jsonStream(employeeBL.getTicketById(Integer.parseInt(ctx.pathParam("employee_Id"))));
			};
		}

		public Handler add() {
			// TODO Auto-generated method stub
			return ctx -> {
				employeeBL.addEmployee(ctx.bodyStreamAsClass(Employee.class));
			};
		}

		public Handler update() {
			// TODO Auto-generated method stub
			return ctx -> {
				employeeBL.updateEmployee(ctx.bodyStreamAsClass(Employee.class));
			};
		}

	}