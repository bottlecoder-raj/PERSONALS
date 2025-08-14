import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class budget {
    public static void main(String[] args){
        Scanner scanner = new Scanner(  System.in);
        System.out.println("Please enter your monthly income: $");
        double income=scanner.nextDouble();
        System.out.println("Please enter your rent cost: $");
        double rent=scanner.nextDouble();
        System.out.print("Please enter your groceries: $");
        double grocery=scanner.nextDouble();
        System.out.print("Please enter your transportation: $");
        double transportation=scanner.nextDouble();
        System.out.print("Please enter your entertainment: $");
        double entertainment=scanner.nextDouble();

        double total_expense=rent+grocery+transportation+entertainment;
        double remaining_budget=income - total_expense;
        double rent_percent=(rent/income)*100;
        double grocery_percent=(grocery/income)*100;
        double entertainment_percent=(entertainment/income)*100;
        double transport_percent=(transportation/income)*100;

        System.out.println("\n********** Budget summary **********");
        System.out.printf("Monthly Income: $%.2f\n",income);
        System.out.printf("Total Expense: $%.2f\n",total_expense);
        System.out.printf("Remaining Budget: $%.2f\n",remaining_budget);
        System.out.println("*************\n Expenses Breakdown\n");
        System.out.printf("Rent: $%.2f (%.2f%% of income)\n",rent,rent_percent);
        System.out.printf("Groceries: $%.2f (%.2f%% of income)\n",grocery,grocery_percent);
        System.out.printf("Entertainment: $%.2f (%.2f%% of income)\n",entertainment,entertainment_percent);
        System.out.printf("Transportation: $%.2f (%.2f%% of income)\n",transportation,transport_percent);

    }
}
