package njit.cs.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.reflect.Method;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DemoJunitTest {
	
    private DemoJunit demoJunit;
    
    @BeforeEach
    public void setUp() {
        demoJunit = new DemoJunit();
    }
    
    @Test
    public void testGetResult() {
        String result = demoJunit.getResult();
        assertEquals("Hello Jack", result);
    }
    
    @Test
    public void testGetString() throws Exception {
        // Use reflection to access the private method
        Method method = DemoJunit.class.getDeclaredMethod("getString");
        method.setAccessible(true);
        
        String result = (String) method.invoke(demoJunit);
        assertEquals("Hello Jack", result);
    }
    
    @Test
    public void testGetClient() throws Exception {
        // Use reflection to access the private static method
        Method method = DemoJunit.class.getDeclaredMethod("getClient");
        method.setAccessible(true);
        
        String result = (String) method.invoke(null);
        assertEquals("Jack", result);
    }
	
	
}
