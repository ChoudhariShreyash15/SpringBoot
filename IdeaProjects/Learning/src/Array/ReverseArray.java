package Array;

public class ReverseArray {
    public static void main(String[] args){
        int[] n = {1,2,3,4,5};
        System.out.print("[ ");
        for (int i=n.length-1; i>=0; i--){
            System.out.print(n[i] + " ");
        }
        System.out.println("]");
    }
}
