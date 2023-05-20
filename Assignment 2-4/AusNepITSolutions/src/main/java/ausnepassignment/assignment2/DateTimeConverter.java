package ausnepassignment.assignment2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
public class DateTimeConverter {

    // converting current local data and date to UTC
    public static LocalDateTime convertLocalDateTimeToUTC() {
        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
            return zonedDateTime.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
        } catch (Exception e) {
            System.out.println("Error Converting to UTC: " + e.getMessage());
             return null;
        }
    }
    // converting to current local data and date from UTC
    public  static  LocalDateTime convertLocalDateTimeFromUTC(LocalDateTime utcDateTime){
        try {
            ZonedDateTime zonedDateTime = utcDateTime.atZone(ZoneOffset.UTC);
            return zonedDateTime.withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
        }catch(Exception e){
            System.out.println("Error converting current local date and time from UTC: " + e.getMessage());
              return null;
        }

    }


    public static void main(String[] args) {
        try {
            LocalDateTime currentLocalDateTime = LocalDateTime.now();
            System.out.println("Current Local Date and Time:  " + currentLocalDateTime);

            LocalDateTime utcDateTime = convertLocalDateTimeToUTC();
            if (utcDateTime != null) {
                System.out.println("Converted to UTC Date and Time Form Current Local Date and Time: " + utcDateTime);

                System.out.println();
                LocalDateTime localDateTime = convertLocalDateTimeFromUTC(utcDateTime);
                if (localDateTime != null) {
                    System.out.println("UTC Date and Time: " + utcDateTime);
                    System.out.println("Converted Current Local Date and Time From UTC: " + localDateTime);
                }
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
