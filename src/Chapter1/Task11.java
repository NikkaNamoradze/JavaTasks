package Chapter1;

public class Task11 {
    public static void main(String[] args) {
        int CURRENT_POPULATION = 312032486;
        final int SECONDS_PER_YEAR = 365 * 24 * 60 * 60;
        final int BIRTH_RATE_SECONDS = 7;
        final int DEATH_RATE_SECONDS = 13;
        final int IMMIGRANT_RATE_SECONDS = 45;

        for (int year = 1; year <= 5; year++) {
            int births = SECONDS_PER_YEAR / BIRTH_RATE_SECONDS;
            int deaths = SECONDS_PER_YEAR / DEATH_RATE_SECONDS;
            int immigrants = SECONDS_PER_YEAR / IMMIGRANT_RATE_SECONDS;

            int netChange = births - deaths + immigrants;
            CURRENT_POPULATION += netChange;

            System.out.println("Year " + year + ": " + CURRENT_POPULATION);

        }
    }
}
