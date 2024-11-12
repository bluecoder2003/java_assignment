import java.util.Scanner;

public class CitySearch {

    public static void main(String[] args) {
        // Array of 10 city names
        String[] cities = {
            "Mumbai", "Delhi", "Kolkata", "Chennai", "Bangalore", 
            "Hyderabad", "Pune", "Ahmedabad", "Surat", "Jaipur"
        };
        
        // Array of corresponding STD codes for the cities
        int[] stdCodes = {
            22, 11, 33, 44, 80, 40, 20, 79, 261, 141
        };

        // Scanner to accept user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a city name
        System.out.println("Enter the name of the city you want to search:");
        String cityToSearch = sc.nextLine();

        // Variable to track if the city is found
        boolean found = false;

        // Search for the city in the cities array
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(cityToSearch)) {
                // If city is found, display the STD code and city name
                System.out.println("Search Successful");
                System.out.println("City: " + cities[i] + ", STD Code: " + stdCodes[i]);
                found = true;
                break;
            }
        }

        // If the city was not found, display an unsuccessful message
        if (!found) {
            System.out.println("Search Unsuccessful, no such city in the list.");
        }

        sc.close(); // Close the scanner
    }
}
