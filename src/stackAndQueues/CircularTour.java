package stackAndQueues;

import java.util.*;

class PetrolPump {
    int petrol;
    int distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0;  // Starting index of the tour
        int surplus = 0; // Track surplus petrol
        int deficit = 0; // Track petrol shortage

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;

            // If surplus goes negative, we cannot start from this or any previous station
            if (surplus < 0) {
                start = i + 1;  // Try starting from the next pump
                deficit += surplus; // Store deficit
                surplus = 0; // Reset surplus
            }
        }

        // If total petrol (surplus + deficit) is non-negative, return the start index
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int start = findStartingPoint(pumps);
        if (start != -1)
            System.out.println("Start at petrol pump index: " + start);
        else
            System.out.println("No valid starting point exists.");
    }
}
