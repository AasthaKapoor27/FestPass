import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FestPass {
    static class Event {
        String id, name, venue;
        int available;

        Event(String id, String name, String venue, int available) {
            this.id = id;
            this.name = name;
            this.venue = venue;
            this.available = available;
        }
    }

    private static final List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        events.add(new Event("EVT001", "TechFest 2026", "Main Auditorium", 145));
        events.add(new Event("EVT002", "Cultural Night", "Open Air Theatre", 82));
        events.add(new Event("EVT003", "AI Innovation Summit", "Seminar Hall", 37));
        events.add(new Event("EVT004", "Coding Hackathon", "Computer Lab", 12));

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n==================================");
                System.out.println("       FESTPASS CAMPUS PORTAL");
                System.out.println("==================================");
                System.out.println("1. View events");
                System.out.println("2. Register for an event");
                System.out.println("3. View summary");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine().trim();
                switch (choice) {
                    case "1": showEvents(); break;
                    case "2": register(scanner); break;
                    case "3": showSummary(); break;
                    case "4":
                        System.out.println("Thanks for trying FestPass!");
                        return;
                    default:
                        System.out.println("Invalid option. Choose 1, 2, 3, or 4.");
                }
            }
        }
    }

    private static void showEvents() {
        System.out.println("\n--- UPCOMING CAMPUS EVENTS ---");
        for (Event event : events) {
            System.out.printf("%s | %-22s | %-20s | Available seats: %d%n",
                    event.id, event.name, event.venue, event.available);
        }
    }

    private static void register(Scanner scanner) {
        showEvents();
        System.out.print("\nEnter event ID: ");
        String id = scanner.nextLine().trim();

        for (Event event : events) {
            if (event.id.equalsIgnoreCase(id)) {
                if (event.available <= 0) {
                    System.out.println("Sorry, this event is full.");
                } else {
                    event.available--;
                    System.out.println("Demo registration successful for " + event.name + ".");
                    System.out.println("Remaining seats: " + event.available);
                }
                return;
            }
        }
        System.out.println("Event ID not found.");
    }

    private static void showSummary() {
        int totalAvailable = 0;
        for (Event event : events) totalAvailable += event.available;
        System.out.println("\n--- EVENT SUMMARY ---");
        System.out.println("Events listed: " + events.size());
        System.out.println("Available seats: " + totalAvailable);
    }
}
