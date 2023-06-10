
interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("text from first interface");
    }
    public void myOtherMethod(){
        System.out.println("text from second interface");
    }
}

public class Multiple {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();

    }
}
