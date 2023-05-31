//static and public modifiers
public class Main {
      public void myName(){
        System.out.println("rejo");
      }
      static void myAge(){
        System.out.println("24");
      }

      public static void main(String[] args) {
            Main name = new Main();
            //public method must be called by creating objects
            name.myName();
            //myName();
            //static method can be called without creating an object
            myAge();
      }
}
