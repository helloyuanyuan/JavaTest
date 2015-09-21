package JavaTest;

import org.junit.Test;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

public class braintree {

	private static BraintreeGateway gateway = new BraintreeGateway(Environment.SANDBOX, "5zsxcbr4p7tdg9b5", "cgymsf3ktp5x679c", "9f47c805daac32392df693002a81a1bd");
	String clientToken = gateway.clientToken().generate();
	
	post(new Route("/client_token") {
		  @Override
		  public Object handle(Request request, Response response) {
		    return gateway.clientToken().generate();
		  }
		});

	@Test
	public void test() throws Exception {
		System.out.println(clientToken);
	}
}
