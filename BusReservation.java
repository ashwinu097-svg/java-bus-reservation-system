public class Bus {

    int busNo;
    int capacity;

    Bus(int busNo, int capacity) {
        this.busNo = busNo;
        this.capacity = capacity;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: " + busNo + " Capacity: " + capacity);
    }
}
