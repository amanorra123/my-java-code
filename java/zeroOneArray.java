import java.util.Scanner;

public class zeroOneArray {
//    static void SwapInArray(int [] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
    static void ZeroAndOnes(int[] arr){
        int n=arr.length;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
    }
    static void print(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the element in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array before sorting");
        print(arr);
        ZeroAndOnes(arr);
        System.out.println("\narray after sort:");
        print(arr);

    }
}
