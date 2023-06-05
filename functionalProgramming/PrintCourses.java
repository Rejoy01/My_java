import java.util.List;

public class PrintCourses {
        
    public static void Print(List<String> Course){
        Course.stream().filter((c)-> c.contains("Spring")).forEach(System.out::println);
    }

    public static void printCourse(List<String> Course){
        Course.stream().filter((n)-> n.length()>=4).forEach(System.out::println);
    }

    public static void main(String[] args) {
        
            
            List<String> courses = List.of("Spring","Spring Boot","MERN","AWS","AZURE","API");
            printCourse(courses);
            System.out.println("==============");
            Print(courses);
        }
    }


