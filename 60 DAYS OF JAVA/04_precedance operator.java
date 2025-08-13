import java.util.Scanner; 
    
public class day02 {
    public static void main(String args[]){
        
        int a=10;
        int b=5;
        int c=2;
        int result = a+b *c;//20
        System.out.println("Result is: " + result);
        result=(a+b)*c;//30
        System.out.println("Result is: " + result);

        //Associavity
        result=a-b-c;
        System.out.println("Result is: " + result);
        result =a - (c- ++b);
        System.out.println("Result is: " + result);
        result +=a - (c- b);
        System.out.println("Result is: " + result);
        }
}
