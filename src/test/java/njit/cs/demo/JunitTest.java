package njit.cs.demo;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JunitTest {
	
	@Test
    public void test() {
		
		List<UserRoleRequestRecord> mockRecords = new ArrayList<>();
        
        // Add records with different statuses
        mockRecords.add(createMockRecord(1L, "A")); // Approved
        mockRecords.add(createMockRecord(2L, "R")); // Rejected
        mockRecords.add(createMockRecord(3L, "P")); // Pending
        
        mockRecords.forEach((item) -> System.out.println(item.getRequestStatus()));
        
		System.out.println("Hello");
	}
	
	private UserRoleRequestRecord createMockRecord(Long requestId, String status) {
        UserRoleRequestRecord record = mock(UserRoleRequestRecord.class);
        when(record.getRequestId()).thenReturn(requestId);
        when(record.getRequestStatus()).thenReturn(status);
        return record;
    }
	
}
