import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums={1,5,2,3,4,7,6,0};
        System.out.println("Array length: " + nums.length);
        Arrays.sort(nums);//    sort nums array
        System.out.println(Arrays.toString(nums));
        int index =Arrays.binarySearch(nums,5);
        System.out.println("Index of 5 is at " + index);


         nums = new int[5];
        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums,0,3,10);
        Arrays.fill(nums,3,5,11);
        System.out.println("Edited array: " +Arrays.toString(nums));
        int[] mynums={10,10,0,11,11};
        System.out.println("Status: "+Arrays.equals(nums,mynums));
        int[] copy=Arrays.copyOf(nums,10);
        System.out.println("Copy: " + Arrays.toString(copy));


    }
}
