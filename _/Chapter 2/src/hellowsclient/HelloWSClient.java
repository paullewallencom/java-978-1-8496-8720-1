/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellowsclient;

/**
 *
 * @author dvohra
 */
import hellows.*;

public class HelloWSClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        hellows.HelloWSService service = new hellows.HelloWSService();

        hellows.HelloWS port = service.getHelloWSPort();
        String result = port.hello("John Smith.");
        System.out.println(result);
    
}
}