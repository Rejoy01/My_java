import java.util.List;

public class SquaresofEvenNumbers {
    
    public static void PrintSqaures(List<Integer> number){
        number.stream().filter(num -> num % 2==0 && num > 0).map((num)->  num * 2).forEach(System.out::println);
    }
    public static void PrintNumofChar(List<String> words){
        words.stream().forEach(s -> System.out.println(s.length()));
    }
public static void main(String[] args) {
    List<Integer> number = List.of(1,2,12,6,8,9,4,3,0);
    List<String> names = List.of("rejo","sachin","gokul");
    PrintSqaures(number);
    System.out.println("=====================================================");
    PrintNumofChar(names);
}

}
