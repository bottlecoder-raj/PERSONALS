public class Animal {
    String name;

    public Animal(String name){
       this.name=name;
       System.out.println("Animal constructor " + name);
    }
    void eat(){
        System.out.println("The animal eats food!");
    }
}
