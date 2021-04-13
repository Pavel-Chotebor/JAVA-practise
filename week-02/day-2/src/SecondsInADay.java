public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondInADay = 86400;

        System.out.println( "remaining time:" + (secondInADay - (currentHours * 3600) + (currentMinutes * 60) + currentSeconds ) + "s");
    }
}
