/**
 * UseCase2RoomInitialization
 *
 * This class demonstrates basic room modeling using abstraction,
 * inheritance, and static availability representation.
 *
 * @author YourName
 * @version 2.1
 */

// Abstract class
abstract class Room {
    private String roomType;
    private int beds;
    private double price;

    // Constructor
    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    // Method to display room details
    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Price per night: $" + price);
    }
}

// Single Room class
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 1000.0);
    }
}

// Double Room class
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 1800.0);
    }
}

// Suite Room class
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 3000.0);
    }
}

// Main class
public class UseCase1 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Book My Stay Application ");
        System.out.println(" Version: 2.1 ");
        System.out.println("====================================");

        // Create room objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display room details
        System.out.println("\n--- Room Details ---");

        System.out.println("\nSingle Room:");
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room:");
        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room:");
        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);

        System.out.println("\nApplication execution completed.");
    }
}