import java.util.Scanner;

public class sumarray {
    static void makeprefixsumArray(int []arr){
        int n=arr.length;
//       arr[0]=0 ;

        for(int i=1;i<arr.length;i++){

           arr[i]= arr[i]+arr[i-1];
        }

    }

    static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        System.out.println("enter the element of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        makeprefixsumArray(arr);
        print(arr);
    }
}
