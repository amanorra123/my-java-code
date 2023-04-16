import java.util.Scanner;

public class perfixArray {
    static int[] makeprefixsumArray(int []arr){
        int n=arr.length;
        int[] pref=new int [n];
        pref[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            pref[i]= arr[i]+pref[i-1];
        }
        return pref;
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
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        print(arr);
        System.out.println("\n new array:");
        int [] pref=makeprefixsumArray(arr);
        print(pref);
    }
}
