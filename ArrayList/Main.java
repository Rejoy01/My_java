import java.util.ArrayList;
// another useful class in java util package is collections
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("rejo");
        name.add("sachin");
        name.add("1");
        //for sorting lists alphabetically or numerically
        Collections.sort(name);

        for(String i : name){
            System.out.println(i);
        }

        System.out.println(name);

        
    }   

}
