public class RunningLog {

    public static void main(String[] args) {
//        int durationMinutes = 49;
//        int distanceKm = 7;
//
//        int paceMinutes = durationMinutes / distanceKm;
//
//        System.out.println(paceMinutes + ":00 min/km");

        double paceMinutes =calculatePaceMinutes(49,7);
        int wholeMinutes = (int) paceMinutes;
        double seconds = (paceMinutes - wholeMinutes) * 60;

        System.out.printf("%d:%02d min /km%n", wholeMinutes, (int) seconds);





    }

    static double calculatePaceMinutes(double durationMinutes, double distanceKm){
        return durationMinutes / distanceKm;
    }
}
