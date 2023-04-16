import java.util.Scanner;

public class zeroOnesswapp {
    static void swappzeroOnes(int arr[]){
        int n=arr.length;
        int left=0;
        int right =n-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]==0) left++;
            if(arr[right]==1) right--;

        }
    }static void print(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("sorted array:");
        swappzeroOnes(arr);
        print(arr);
    }
}
