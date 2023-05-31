public class Main {
    private String Name ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setName("Jhon");
        //System.out.println(obj.name);this will throw an error as its variable is declared as private
        System.out.println(obj.getName()); 
    }
}
//Encapsulation is to make sure that sensitive data is hidden from users
// to achieve that
//declare class variable/attributes as private
//provide get and set methods to access and update the value of a private variable
