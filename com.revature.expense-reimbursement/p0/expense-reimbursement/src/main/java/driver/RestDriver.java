package driver;

import bl.TicketBL;
import controllers.IController;
import controllers.TicketController;
import dl.DBRepository;
import dl.EmployeeDAO;
import dl.TicketDAO;
import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;
import utilis.Router;




public class RestDriver {
	
		public static void main(String[] args) {
			
			IController tControler = new TicketController(
					new TicketBL(new DBRepository(new EmployeeDAO(), new TicketDAO())));
//			IController employeeController = new EmployeeControler(
//					new EmployeeBL(new DBRepository(new EmployeeDAO(), new TicketDAO())));
					
			Javalin app = Javalin.create(config -> {
				config.registerPlugin(new OpenApiPlugin(getOpenApiOptions()));
			}).start(4302);
			Router router = new Router(app, tControler, tControler, null);
			router.setUpEndPoints();
			

		}
		
	





	private static OpenApiOptions getOpenApiOptions() {
		// Configuring swagger
		// We'll use swagger for documentation and testing our API
		Info applicationInfo = new Info().version("1.0").description("p0");
		return new OpenApiOptions(applicationInfo).path("/swagger-docs")
				.swagger(new SwaggerOptions("/swagger").title("p0 API Docs"));
	}
}
		// TODO Auto-generated method stub
		
		

