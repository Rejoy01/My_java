abstract class Details { // abstract class
    public String name = "john";
    public int age = 29;
    public abstract void study();  // abstract method  
}
class Student extends Details {
    public void study() {// the body of the abstarct method is provided here
        System.out.println("Studying all day along");
    }
}

//Abstarct method belongs to an abstract class and it does not have a body 
//body is provided by the subclasses