package hellows;
import javax.jws.*;
@WebService(portName = "HelloWSPort", serviceName = "HelloWSService", targetNamespace = "http://hellows/", endpointInterface = "hellows.HelloWS")
public class HelloWSImpl implements HelloWS {
	public String hello(String name) {
		// replace with your impl here
		 return "Hello "+name +" Welcome to Web Services!";

	}
}
