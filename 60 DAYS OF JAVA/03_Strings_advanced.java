import java.util.Scanner; 
    
public class day02 {
    public static void main(String args[]){
        
        String str1 ="Java";
        String str2 = "Java";
        String str3 = new String("Java");
        //Comparing references or memory address.......
        System.out.println("Comparing " + str1 + " and " + str2 + " using == " + (str1 == str2));
        System.out.println("Comparing " + str1 + " and " + str3 + " using == " + (str1 == str3));

        //Comaparing value of variables  
        System.out.println("Comparing str1 and str2 using equals() " + str1.equals(str2));
        System.out.println("Comparing str1 and str3 using equals() " + str1.equals(str3 ));

        //Comapring values of variables  while ignoring case sensitivity
        System.out.println("Comparing str1 and str2 using equalsIgnoreCase() " + str1.equalsIgnoreCase(str2));
        System.out.println("Comparing str1 and str3 using equalsIgnoreCase() " + str1.equalsIgnoreCase(str3));
    
        //comapring using lexicographically
        String animal1="Cat";
        String animal2="Dog";
        String animal3="Cat";

        System.out.println("Comparing animal1 and animal2 using comapreTo() " + animal1.compareTo(animal2));
        System.out.println("Comparing animal1 and animal3 using comapreTo() " + animal1.compareTo(animal3));
        System.out.println("Comparing animal2 and animal1 using comapreTo() " + animal2.compareTo(animal1));
        
       //SubStrings in String
       String phrase=new String("Programming in Java");
       String word1 = phrase.substring(0,11);//start[including],end[excluding]
       String word2 = phrase.substring(15);//start
       System.out.println("Word 1 is: " + word1);
       System.out.println("Word 2 is: " + word2);

        //String replace
       phrase="The quick brown fox";
       String new_phrase= phrase.replace('o','a');
       System.out.println("Original phrase:" + phrase);
       System.out.println("New phrase:" + new_phrase);

       String uppercase_String = phrase.toUpperCase();//UPPERCase
       System.out.println("Capitalized String " +  uppercase_String); 

       String lowercase_String = phrase.toLowerCase();//LOWERCase
       System.out.println("smallcased String " +  lowercase_String); 
    
        String name="Alice";
        int age =30;
        String message= String.format("Hello, %s! You are  %d years old",name,age);
        System.out.println(message);//Displaying similar to C language

        double price =1234.567;
        String formatPrice = String.format("The price is $%.2f",price);
        System.out.println(formatPrice);//Displaying similar to C language


        }
}
