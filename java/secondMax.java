import java.util.Scanner;

public class secondMax {
    static int findMax(int arr[]){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        } return mx;

    }
    static int findSecMax(int arr[]){
        int mx=findMax(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmaximum=findMax(arr);
        return secondmaximum;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 element:");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second max is:"+findSecMax(arr));
    }

}
