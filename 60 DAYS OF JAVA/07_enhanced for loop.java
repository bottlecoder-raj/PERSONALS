public class Array {
    public static void main(String[] args){


        int[] numbers = {1,2,3,4,5};
        System.out.println("Array length: "+numbers.length);
        int counter=0;
        for (int number : numbers) {
            System.out.println("Counter is at: "+ counter++);
            System.out.println(number);
        }
    }


}
