package test.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testWorkerConstructor() {
        Worker worker = new Worker("John", "Doe", "002", "Mr.", 1985, 20.0);
        assertEquals(20.0, worker.calculateWeeklyPay(40));
    }

    @Test
    public void testCalculateWeeklyPay_NoOvertime() {
        Worker worker = new Worker("John", "Doe", "002", "Mr.", 1985, 20.0);
        double pay = worker.calculateWeeklyPay(40);
        assertEquals(800.0, pay);
    }

    @Test
    public void testCalculateWeeklyPay_WithOvertime() {
        Worker worker = new Worker("Jane", "Smith", "003", "Ms.", 1990, 22.5);
        double pay = worker.calculateWeeklyPay(45); // 5 hours overtime
        assertEquals(1012.5, pay); // 40*22.5 + 5*22.5*1.5 = 900 + 112.5 = 1012.5
    }
}
