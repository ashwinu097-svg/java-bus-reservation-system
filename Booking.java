import java.util.*;

public class Booking {

    String passengerName;
    int busNo;

    static ArrayList<Booking> bookings = new ArrayList<>();

    Booking(String passengerName, int busNo) {
        this.passengerName = passengerName;
        this.busNo = busNo;
    }

    public boolean isAvailable(ArrayList<Bus> buses) {

        int capacity = 0;

        for (Bus bus : buses) {
            if (bus.busNo == busNo) {
                capacity = bus.capacity;
            }
        }

        int booked = 0;

        for (Booking b : bookings) {
            if (b.busNo == busNo) {
                booked++;
            }
        }

        return booked < capacity;
    }

}
