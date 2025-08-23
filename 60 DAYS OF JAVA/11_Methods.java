import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args){
    sayhello();
    para("Raj",18);
    para("Missy",28);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many slices of cheese do you want? ");
    makeSandwich(scanner.nextInt());

    scanner.close();
    ChangeName("henry");
    Random random = new Random();
    int Randnum = random.nextInt(55,100);// FROM 0RIGIN TO BOUND
    System.out.println(Randnum);
    }
    public static void sayhello(){
        System.out.println("Hllo world");//VOID FMETHOD
    }
    public static void para(String name,int age){
        System.out.println("Hello "+ name + " of " + age + " years old.");//INPUT METHOD
    }
    public static void makeSandwich(int piceseofChesse){
        System.out.println("Take two slices of bread");
        System.out.println("Spread butter on one slice");
        for (int i=0;i<piceseofChesse;i++){
            System.out.println("Add a slice of cheese");

        }
        System.out.println("Put a second slice of bread on top.");
        System.out.println("Sandwich is ready!");

    }
    public static void ChangeName(String name){
        name="Frank";
        System.out.println("Inside Name:"+name);
    }

}
