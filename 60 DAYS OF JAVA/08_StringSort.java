import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums={2,5,1,3,4,7,8,3};
        String[] names={"Frank","Tank","Crank"};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        Arrays.sort(nums);
        Arrays.sort(names);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

    }
}
