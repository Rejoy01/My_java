import java.io.FileWriter; //file writer Class
import java.io.IOException; // import the IOException class to handle errors


public class WriteToFile {
    public static void main(String[] args) {
        try{
        FileWriter myWritter = new FileWriter("filenames.txt");
        myWritter.write("Files in java be tricky , but it is Fun enough!");
        myWritter.close();
        System.out.println("Successfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
