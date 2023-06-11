// Data abstarcation is the process of hiding certain details and show only essential information to the user

// abstarcation can be acheived with either abstarcat classes or interfaces

// The abstract keyword is a non-access modifier, used for classes and methods:

// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

abstract class Animal{
    public abstract void animalSound();
    //abstrcat class can have regular method also
    public void sleep(){
        System.out.println("Zzz");
    }
}
// Subclass (inherit from Animal)
class Dog extends Animal{
    public void animalSound(){System.out.println("bow bow");}
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }
}