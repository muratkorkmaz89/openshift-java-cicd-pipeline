package helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloWorldService {

	@GET
	public String sayHello() {
		return "<h1>Hello Openshift!<h1>";
	}
}
