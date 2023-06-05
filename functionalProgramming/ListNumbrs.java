import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ListNumbrs {
    public static void main(String[] args){
    //    printAllNumbersInListStructure(List.of(12,9,13,4,5));
        printAllEvenNumbersInListStructure(List.of(12,9,13,4,5));

    }
    // public static void print(int numbers){
    //     System.out.println(numbers);
    // }
    public static boolean isEven(int numbers){
        return numbers%2 ==0;
    }

    public static void printAllNumbersInListStructure(List<Integer> numbers){
        //[12,9,13,4,6,2,4]
        //after stream
        //12
        //9
        //13
        //4
        // for(int number : numbers){
        //     System.out.println(number);
        // }
        
    //     numbers.forEach((n)->System.out.println(n));
    // }
    numbers.stream().forEach(System.out::println);
}
public static void printAllEvenNumbersInListStructure(List<Integer> numbers){
    // numbers.stream().filter(ListNumbrs::isEven).forEach(System.out::println);
    numbers.stream().filter((n)-> n%2==0).forEach(System.out::println);
}
}
