public class Array {
    public static void main(String[] args){


        int[] nums = {2,5,1,3};
        int n= nums.length/2;
        int[] rearranged = new int[nums.length];

        for(int i=0;i<n;i++){
            rearranged[2*i] =nums[i];
            rearranged[2*i+1]= nums[i+n];
        }
        System.out.println("Rearranged array: ");
        for(int i : rearranged){
            System.out.print(i);
        }
    }


}
