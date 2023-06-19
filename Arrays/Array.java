import java.util.List;

public class  Array {
    String[] cars = {"Volvo","BMW","Ford","Mazda"};
    
    public static void main(String[] args) {

        Array car = new Array();

        List<Integer> names = List.of(1,2,3,4,5,6,7,8,9,10);
        
        for(int i = 0 ; i < car.cars.length ; i++) {
        
        System.out.println(car.cars[i]);   
    }
    names.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    
    }
}
