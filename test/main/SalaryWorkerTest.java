package test.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testSalaryWorkerConstructor() {
        SalaryWorker salaryWorker = new SalaryWorker("Anna", "Taylor", "004", "Ms.", 1992, 52000);
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40)); // 52000/52 = 1000
    }

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Mark", "Williams", "005", "Dr.", 1980, 60000);
        double weeklyPay = salaryWorker.calculateWeeklyPay(40);
        assertEquals(1153.8461538461538, weeklyPay); // 60000/52
    }
}
