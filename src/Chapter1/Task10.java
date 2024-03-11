package Chapter1;

public class Task10 {
    public static void main(String[] args) {
        final double distanceKm = 14.0;
        final double timeMinutes = 45.0 + 30.0 / 60.0;
        final double milesPerKilometer = 1.0 / 1.6;

        double distanceMiles = distanceKm * milesPerKilometer;

        double speedMph = distanceMiles / (timeMinutes / 60.0);

        System.out.println("Average speed: " + speedMph);

    }
}
