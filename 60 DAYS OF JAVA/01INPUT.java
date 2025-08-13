import java.util.Scanner; 
public class day02 {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter:");
    String name = scanner.nextLine();
    System.out.println("Welcome to the Java Club " + name);
    scanner.close();
        }
}
