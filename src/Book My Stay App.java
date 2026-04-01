import java.util.HashMap;
import java.util.Map;

/**
 * UseCase3InventorySetup
 *
 * This class demonstrates centralized room inventory management
 * using HashMap to maintain a single source of truth.
 *
 * @author YourName
 * @version 3.1
 */

// Inventory class (centralized management)
class RoomInventory {

    private Map<String, Integer> inventory;

    // Constructor - initialize inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        // Register room types with availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Get availability of a specific room type
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update availability (increase/decrease)
    public void updateAvailability(String roomType, int countChange) {
        int current = inventory.getOrDefault(roomType, 0);
        int updated = current + countChange;

        if (updated < 0) {
            System.out.println("Cannot reduce below zero for " + roomType);
        } else {
            inventory.put(roomType, updated);
        }
    }

    // Display full inventory
    public void displayInventory() {
        System.out.println("\n--- Current Room Inventory ---");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

// Main class
class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Book My Stay Application ");
        System.out.println(" Version: 3.1 ");
        System.out.println("====================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        // Simulate updates
        System.out.println("\nUpdating Inventory...");

        inventory.updateAvailability("Single Room", -1); // booking
        inventory.updateAvailability("Suite Room", -2);  // booking
        inventory.updateAvailability("Double Room", +1); // cancellation

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nApplication execution completed.");
    }
}