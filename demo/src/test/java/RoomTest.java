package week5.hotel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RoomTest {
    @Test
    public void testRoomAvailability() {
        Room room = new Room(2, 100.0, false, false);
        assertTrue(room.isAvailable());

        room.checkIn();
        assertFalse(room.isAvailable());

        room.checkOut();
        assertTrue(room.isAvailable());
    }
}
