
// java Does not have a built in DAte class
// import java.time package
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        //represent both date and time
        LocalDateTime myObj = LocalDateTime.now(); 
        //represent a date 
        LocalDate date = LocalDate.now();
        //represent a time
        LocalTime time = LocalTime.now();
        // DateTimeFormatter
        DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //yyyy-MM-dd
        //dd/MM/yyyy
        //dd-MMMM-YYYY
        //E,MMMM dd yyyy
        String formattedDate = myObj.format(myFormatobj);
        System.out.println("Before formating :"+myObj);
        System.out.println(date);
        System.out.println(time);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
