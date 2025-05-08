package week5.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {

    @Test
    public void testAvailableRoomsAndSuites() {
        Hotel hotel = new Hotel("Ocean View", 5, 10, 2, 3);
        assertEquals(7, hotel.getAvailableRooms());
        assertEquals(3, hotel.getAvailableSuites());
    }

    @Test
    public void testSuccessfulBooking() {
        Hotel hotel = new Hotel("Cozy Stay", 5, 10, 0, 0);
        assertTrue(hotel.bookRoom(2, true));  // Book 2 suites
        assertTrue(hotel.bookRoom(5, false)); // Book 5 regular rooms
    }

    @Test
    public void testUnsuccessfulBooking() {
        Hotel hotel = new Hotel("Limited Rooms", 2, 3, 2, 3);
        assertFalse(hotel.bookRoom(1, true));  // No suites available
        assertFalse(hotel.bookRoom(1, false)); // No rooms available
    }
}
