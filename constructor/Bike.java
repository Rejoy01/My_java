public class Bike {
    int modelYear;
    String modelName;
    String price ;
    String company;
    public Bike(int year,String name , String amt , String companyName){
        modelYear = year;
        modelName = name;
        price = amt;
        company = companyName;
    }
    public static void main(String[] args){
        Bike bike = new Bike(2019,"panigale","10lakh","Ducati");
        System.out.println(bike.modelYear+" "+bike.company+" "+bike.modelName+" for "+bike.price);
    }
}
