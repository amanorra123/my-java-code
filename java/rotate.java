import java.util.Scanner;

public class rotate {
    static void swap(int [] arr, int i, int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;}
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    } static void print(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void rotateInPlace(int [] arr,int k){
    int n=arr.length;
    k=k%n;
    reverse(arr,0,n-k-1);
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k:");
        int k=sc.nextInt();
        rotateInPlace(arr,k);
        print(arr);



    }
}
