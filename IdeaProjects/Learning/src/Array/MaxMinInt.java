package Array;

public class MaxMinInt {

    static int MaxInt(int[] arr){
        int max=0;
        for (int i=0; i<arr.length; i++){
            if (arr[max] < arr[i]){
                max=i;
            }
        }
        return arr[max];
    }

    static int MinInt(int[] arr){
        int min=0;
        for (int i=1; i<arr.length; i++){
            if (arr[min] > arr[i]){
                min=i;
            }
        }
        return arr[min];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,6,7,8,9,10};
        System.out.println("Maximum No is " + MaxInt(arr));
        System.out.println("Minimum No is " + MinInt(arr));
    }
}
