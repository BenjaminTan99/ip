package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This class converts the input string of date and time into
 * a better, understandable date and time format.
 */
public class DateTimeConverter {

    /**
     * Empty constructor for DateTimeConverter.
     */
    public DateTimeConverter() {}

    /**
     * Returns a string containing a newly formatted date and time.
     *
     * @param datetime String containing the date and time to be
     *                 changed.
     * @return String containing a newly formatted date and time.
     */
    public String convertDateAndTime(String datetime) {
        String time = datetime.substring(datetime.length() - 4);
        int actualTime = Integer.parseInt(time);
        String hour, minute;
        if (actualTime >= 1200) {
            if ((actualTime - 1200) / 100 < 1) {
                hour = "12";
            } else {
                hour = String.valueOf(Math.round((actualTime - 1200) / 100));
            }
            minute = String.valueOf(actualTime % 100);
            if (minute.equals("0")) {
                minute += "0";
            }
            time = hour + ":" + minute + "PM";
        } else {
            if (actualTime / 100 < 1) {
                hour = "12";
            } else {
                hour = String.valueOf(Math.round(actualTime / 100));
            }
            minute = String.valueOf(actualTime % 100);
            if (minute.equals("0")) {
                minute += "0";
            }
            time = hour + ":" + minute + "AM";
        }
        String date = datetime.substring(0, datetime.length() - 5);
        LocalDate d1 = LocalDate.parse(date);
        return d1.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) + " " + time;
    }
}
