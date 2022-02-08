package utilis;

import controllers.IController;
import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

public class Router {
	private Javalin app;
	private IController tController;
	private IController employeeControler;
	public Router(Javalin app, IController tControler, IController tController, IController employeeControler)
	
	{
		this.app = app;
		this.tController = tController; 
		this.employeeControler = employeeControler;}
	
	
	public void setUpEndPoints() { 
	
		app.get("/Ticket", OpenApiBuilder.documented(DocumentationFact.getDoc("getTicket"), tController.getAll()));
		app.get("/Ticket/{ticket_id}/employee", OpenApiBuilder.documented(DocumentationFact.getDoc("getTicketById"),tController.getById()));
		app.post("/Ticket",  OpenApiBuilder.documented(DocumentationFact.getDoc("addTicket"), tController.add()));
		app.put("/Ticket", OpenApiBuilder.documented(DocumentationFact.getDoc("updateTicket"), tController.update()));
		
}}