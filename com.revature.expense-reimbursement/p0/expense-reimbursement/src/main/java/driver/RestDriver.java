package driver;

	import dl.DBRepository;
import io.javalin.Javalin;

	public class RestDriver {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// Create Controllers 
			IController issueController = new IssueController(new EmployeeBL(new DBRepository(new IssueDAO(), new SolutionDAO())));
			Javalin app = Javalin.create().start(7000);
			app.get("/", ctx -> {ctx.result("Hello World!");});
			app.get("/Issues", issueController.getAll());
		}

	}


