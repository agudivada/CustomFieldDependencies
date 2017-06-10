import static spark.Spark.*;

public class Main {
	public static void main(String[] args) {

		port(Integer.valueOf(System.getenv("PORT")));

		//get("/", (request, response) -> {
		
		//System.out.println("Hello World");
		//});

		get("/hello", (req, res) -> "Hello World");
	}
	
}
