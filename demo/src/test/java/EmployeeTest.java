package week5.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void testRegularHoursAndPay() {
        Employee emp = new Employee("EMP001", "John", "Front Desk", 20.0, 38.0);
        assertEquals(38.0, emp.getRegularHours());
        assertEquals(0.0, emp.getOvertimeHours());
        assertEquals(760.0, emp.getTotalPay()); // 38 * 20
    }

    @Test
    public void testOvertimeHoursAndPay() {
        Employee emp = new Employee("EMP002", "Jane", "Cleaning", 15.0, 45.0);
        assertEquals(40.0, emp.getRegularHours());
        assertEquals(5.0, emp.getOvertimeHours());
        assertEquals(712.5, emp.getTotalPay()); // 40*15 + 5*22.5
    }

    @Test
    public void testPunchInOutManual() {
        Employee emp = new Employee("EMP003", "Mike", "Maintenance", 18.0, 0.0);
        emp.punchIn(8.0);
        emp.punchOut(16.0); // 8 hours
        assertEquals(8.0, emp.getHoursWorked());
    }
}
