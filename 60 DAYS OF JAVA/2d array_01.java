import java.util.Arrays;
public class main {
    /*[
        00,01,02,
            10,11,12,
            20,21,22

            ]

     */


    public static void main(String[] args){
        int[][] my2dArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
                /*new int[3][3];
        my2dArray[0][0] = 1;
        my2dArray[0][1] = 2;
        my2dArray[0][2] = 3;
        my2dArray[1][0] = 4;
        my2dArray[1][1] = 5;
        my2dArray[1][2] = 6;
        my2dArray[2][0] = 7;
        my2dArray[2][1] = 8;
        my2dArray[2][2] = 9;*/
        int largest = my2dArray[0][0];
        System.out.println("My2D Array length: " + my2dArray.length);

        for (int[] ints : my2dArray) {
            for (int anInt : ints) {
                     System.out.print(anInt + " ");

            }
            System.out.println();
        }

    }
}
