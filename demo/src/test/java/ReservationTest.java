package week5.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {
    @Test
    public void testGetPriceWeekendKingRoom() {
        Reservation res = new Reservation("King", 2, true);
        // 139 * 1.1 = 152.9
        assertEquals(152.9, res.getPrice(), 0.01);
    }

    @Test
    public void testReservationTotal() {
        Reservation res = new Reservation("Basic", 3, false);
        // 124 * 3 = 372
        assertEquals(372.0, res.getReservationTotal(), 0.01);
    }
}
