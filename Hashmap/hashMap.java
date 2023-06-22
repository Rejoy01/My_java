import java.util.HashMap;

public class hashMap {
    
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    public static void main(String[] args) {
        hashMap city = new hashMap();
        
        city.capitalCities.put("Kerala","Kochi");
        city.capitalCities.put("UK","london");
        city.capitalCities.put("AmericA","Washington");

    city.capitalCities.forEach((key,value)->System.out.println("Country: "+key+" ,Capital : "+value ));
    }

    

  




}
