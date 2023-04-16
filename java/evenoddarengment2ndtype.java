import java.util.Scanner;

public class evenoddarengment2ndtype {
    static void swap(int[]arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void evenoddparity(int[] arr){
        int n=arr.length;
        int left=0; int right=n-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){ left++;}
            if(arr[right]%2==1) {right--;}
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
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        evenoddparity(arr);
        System.out.println("ans array");
        print(arr);
    }
}
