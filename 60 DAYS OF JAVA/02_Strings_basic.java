//STRINGS BASIC
public class day02 {
    public static void main(String args[]){
        String morning ="Good morning";//general string use
        System.out.println(morning);


        String first_name="John";//Concatenate strings
        String last_name="David";
        String full_name= first_name +" "+ last_name;
        int age =30;
        String bio = "I am " + full_name + " an " + age + " years old.";
        System.out.println(bio);

        String night =new String ("Good Night");//using the same string as a new one using  'new'
        System.out.println(night);
        night="Bad night";
        System.out.println(night);
        int length=night.length();//String length
        System.out.println(length);
        char first_char=night.charAt(0);//indexing.....
        System.out.println("First character int the string is "+first_char);
        }
}
