public class Car {
    int modelYear;
    String modelName;

    public Car(int Year, String model){
        modelYear = Year;
        modelName = model;
    }
    public static void main(String[] args) {
            Car car = new Car(2019,"Mustang");
            System.out.println(car.modelYear+" "+car.modelName);

    }

    }

