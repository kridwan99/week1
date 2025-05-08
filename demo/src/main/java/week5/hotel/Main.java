package week5.hotel;

public class Main {
    public static void main(String[] args) {
        // Create a Hotel
        Hotel hotel = new Hotel("Sunset Inn", 5, 20);

        // Make a Reservation
        Reservation reservation = new Reservation("King", 3, true);
        System.out.println("Reservation for " + reservation.getRoomType() + " room.");
        System.out.println("Total price: $" + reservation.getReservationTotal());

        // Create a Room
        Room room = new Room(2, 100.0, false, false);
        System.out.println("Is the room available? " + room.isAvailable());
        room.checkIn();
        System.out.println("Room checked in. Is it now available? " + room.isAvailable());

        // Book rooms in hotel
        boolean bookingSuccess = hotel.bookRoom(2, false);
        System.out.println("Booking 2 basic rooms successful? " + bookingSuccess);

        // Create an Employee
        Employee employee = new Employee("E123", "Alice", "Housekeeping", 15.50, 38);
        employee.punchIn(9.0);
        employee.punchOut(17.0);
        System.out.println("Employee " + employee.getName() + " worked " + employee.getHoursWorked() + " hours.");
        System.out.println("Total pay: $" + employee.getTotalPay());
    }
}
