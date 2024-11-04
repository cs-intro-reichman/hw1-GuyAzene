// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int parsedHour = hours % 12;
        String suffix = "AM";
        if (hours > 12) {
            suffix = "PM";
        }

        System.out.print(parsedHour);
        System.out.print(":");
        System.out.printf("%02d", minutes);
        System.out.println(" " + suffix);
    }
}