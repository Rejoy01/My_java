// using other class method in second class

// static Methods - it can be accessed directly without creating an object of the class
// public  - it can only accessed by objects


public class Second {
    int z = 3;
    static void getValue(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Main obj2 = new Main();
        Second obj3 = new Second();
        System.out.println(obj2.x+obj3.z);
        getValue();
    }

}
