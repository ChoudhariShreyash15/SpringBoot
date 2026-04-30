package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
//        System.out.print("[ ");
//        for (int i = n.length - 1; i >= 0; i--){
//            System.out.print(n[i] + " ");
//        }
//        System.out.print("]");

//        int start = 0;
//        int end = n.length - 1;
//        while (start < end){
//            int temp = n[start];
//            n[start] = n[end];
//            n[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(n));

        int start = 0;
        int end = n.length - 1;
        while (start < end){
            n[start] = n[start] ^ n[end];
            n[end] = n[start] ^ n[end];
            n[start] = n[start] ^ n[end];
            start++;
            end--;
        }
        System.out.println(Arrays.toString(n));
    }
}
