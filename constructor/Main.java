// Constructor is a speacial method that is used to intialize objects
// constrictor is called at the time of class is created

public class Main {
    int x;
    int y ;
    
    public Main(int r){
        x = 5;
        //constructor parameters
        y = r;
    }
    public static void main(String[] args) {
        Main obj = new Main(2);
        System.out.println(obj.x +" "+obj.y);
    }
}
