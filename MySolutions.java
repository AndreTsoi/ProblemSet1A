public class MySolutions {
    public static void main(String[] args) {
        celsiusToFahrenheit();
        elapsedTime();
        secondsToHMS();
    }


    public static void celsiusToFahrenheit() {
        double celsius = 30;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }

    public static void elapsedTime() {
        int hour = 12;
        int minute = 30;
        int second = 30;

        int secondsSinceMidnight = (hour*60*60) + (minute*60) + second;
        int secondsRemaining = 86400-secondsSinceMidnight;
        double percentage = 100.0*(hour*3600 + minute*60 + second)/(24*60*60);

        System.out.println("The current time is " + hour + ":" + minute + ":" + second + ". It has been " + secondsSinceMidnight + " seconds since the day began.");
        System.out.println("There are " + secondsRemaining + " seconds left in the day.");
        System.out.println("The day is " + percentage + "% done.");

    }

    public static void secondsToHMS() {
        int seconds = 5000;
        int hour = seconds/3600;
        int minute = (seconds%3600)/60;
        int second = (seconds%3600)%60;

        System.out.println(seconds + " seconds = " + hour + " hours, " + minute + " minutes, and " + second + " seconds.");

    }
}