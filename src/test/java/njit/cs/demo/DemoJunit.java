package njit.cs.demo;

public class DemoJunit {

		
	public String getResult() {
		String result = getString();
		return result;
	}
	
	private String getString() {
		String client = DemoJunit.getClient();
		return "Hello "+client;
	}
	
    private static String getClient() {
    	return "Jack";
    }
}
