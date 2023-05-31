class Animal{
    public void AnimalSound(){
        System.out.println("The Animal makes sound");
    } 
}

class Dog extends Animal{
    public void AnimalSound(){
        System.out.println("the dog barks :Bow bow ");
}
}
class Pig extends Animal{
    public void AnimalSound(){
        System.out.println("the pig says : wee wee");
}
}


public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();
        dog.AnimalSound();
        pig.AnimalSound();
    }        
}
