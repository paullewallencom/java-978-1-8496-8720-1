/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellows;

/**
 *
 * @author dvohra
 */
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService(name = "HelloWS", targetNamespace = "http://hellows/")
public interface HelloWS {
	@WebMethod(operationName = "hello")
	public String hello(String name);
}

