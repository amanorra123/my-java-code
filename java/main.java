import java.util.Arrays;
import java.util.Scanner;

public class main {
    static void copy(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int [] arr2= Arrays.copyOfRange(arr,2,3);
        arr2[0]=99;
        System.out.println("first array:");
        copy(arr);
        System.out.println("\nsecond array:");
        copy(arr2);

    }
}
