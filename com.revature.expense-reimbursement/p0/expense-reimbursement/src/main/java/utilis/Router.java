package utilis;

import controllers.IController;
import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

public class Router {
	private Javalin app;
	private IController tController;
	public Router(Javalin app, IController tController)
	
	{
		this.app = app;
		this.tController = tController; 
	}
	
	public void setUpEndPoints() {
	
		app.get("/Ticket", OpenApiBuilder.documented(DocumentationFact.getDoc("getTicket"), tController.getAll()));
		app.get("/Ticket/{ticket_id}/employee", OpenApiBuilder.documented(DocumentationFact.getDoc("getTicketById"),tController.getById()));
		app.post("/Ticket",  OpenApiBuilder.documented(DocumentationFact.getDoc("addTicket"), tController.add()));
//		app.post("/Employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("addEmployee"), EmployeeController.add()));
		app.put("/Ticket", OpenApiBuilder.documented(DocumentationFact.getDoc("updateTicket"), tController.update()));
//		app.get("/Employee/{employee_id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("getEmployee"), EmployeeController.getById()));
	
	}
}