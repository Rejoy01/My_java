
interface Animal {
    public void animalSound();
    public void sleep();
}

  class Pig implements Animal {
    // the body of the animalSound() is provided here
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
    // the body of the slepp() is provided here
    public void sleep(){
        System.out.println("ZZzz");
    }
}

   class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
