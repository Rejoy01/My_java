import java.util.HashMap;

public class hashMap {
    
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    public static void main(String[] args) {
        hashMap city = new hashMap();
        //to add an item
        city.capitalCities.put("India","Delhi");
        city.capitalCities.put("UK","London");
        city.capitalCities.put("USA","Washington");
        System.out.println(city.capitalCities);
        city.capitalCities.forEach((key,value)->System.out.println("Country: "+key+" ,Capital : "+value ));
        city.capitalCities.remove("India");
        // to remove an item
        System.out.println(city.capitalCities);
        // to access value in Hash MAp use get() method
        System.out.println(city.capitalCities.get("UK")); 

    }

    

  




}
