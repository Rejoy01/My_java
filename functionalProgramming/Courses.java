import java.util.List;
import java.util.ArrayList;

public class Courses{

    

    public static void print(List<String> s){
        s.forEach((n) -> System.out.println(n));
    }

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API","PCF");
        List<String> coursess = new ArrayList<String>();
        coursess.add("Rejo");
        coursess.add("Sachin");
        coursess.add("Gokul");
        coursess.remove(1);
        coursess.set(1,"ravin");
        print(coursess);
    }

}