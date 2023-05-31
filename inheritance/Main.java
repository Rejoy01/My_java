class Vechicle{
    protected String brand ="Ford";
    public void honk(){
        System.out.println("Tuut,Tuut");
    }
}

class SuperCar extends Vechicle{
    String ModelName = "Mustang";
    
}




public class Main {
    public static void main(String[] args) {
        SuperCar car = new SuperCar();
        System.out.println(car.brand +" "+ car.ModelName);
        car.honk();
    }
}

