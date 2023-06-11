
// java Does not have a built in DAte class
// import java.time package
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
        //represent both date and time
        LocalDateTime myObj = LocalDateTime.now(); 
        //represent a date 
        LocalDate date = LocalDate.now();
        //represent a time
        LocalTime time = LocalTime.now();
        System.out.println(myObj);
        System.out.println(date);
        System.out.println(time);
    }
}
