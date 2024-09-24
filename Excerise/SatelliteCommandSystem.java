
import java.util.Scanner;

// Satellite Class to manage the satellite's state
class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        this.orientation = direction;
        System.out.println("Satellite rotated to " + direction);
    }

    public void activatePanels() {
        this.solarPanelsActive = true;
        System.out.println("Solar panels activated.");
    }

    public void deactivatePanels() {
        this.solarPanelsActive = false;
        System.out.println("Solar panels deactivated.");
    }

    public void collectData() {
        if (solarPanelsActive) {
            this.dataCollected += 10;
            System.out.println("Data collected: " + dataCollected + " units.");
        } else {
            System.out.println("Cannot collect data. Solar panels are inactive.");
        }
    }

    public void displayStatus() {
        System.out.println("\n--- Satellite Status ---");
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + (solarPanelsActive ? "Active" : "Inactive"));
        System.out.println("Data Collected: " + dataCollected + " units");
    }
}

public class SatelliteCommandSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Satellite satellite = new Satellite();
        satellite.displayStatus();

        while (true) {
            System.out.println("\nEnter a command:");
            System.out.println("1. Rotate Satellite");
            System.out.println("2. Activate Solar Panels");
            System.out.println("3. Deactivate Solar Panels");
            System.out.println("4. Collect Data");
            System.out.println("5. Display Satellite Status");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter direction (North, South, East, West):");
                    String direction = scanner.next();
                    satellite.rotate(direction);
                    break;
                case 2:
                    satellite.activatePanels();
                    break;
                case 3:
                    satellite.deactivatePanels();
                    break;
                case 4:
                    satellite.collectData();
                    break;
                case 5:
                    satellite.displayStatus();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
