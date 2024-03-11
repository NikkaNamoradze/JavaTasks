package Chapter1;

public class Task12 {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETERS = 1.6;
        final int SECONDS_IN_HOUR = 3600;

        double distanceMiles = 24.0;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        int totalTimeInSeconds = hours * SECONDS_IN_HOUR + minutes * 60 + seconds;

        double averageSpeedKph = (distanceMiles * MILES_TO_KILOMETERS) / (totalTimeInSeconds / (double) SECONDS_IN_HOUR);

        System.out.println("Average speed: " + averageSpeedKph);

    }
}
