import java.util.Scanner;

public class rangesumofarray {
    static int[] makeprefixsumArray(int []arr){
        int n=arr.length;

        for(int i=1;i<arr.length;i++){
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        System.out.println("enter the element of the array");
        int[] arr = new int[n+1];
        for(int i=1;i<= n;i++){
            arr[i]=scn.nextInt();
        }
        int [] prefixsum=makeprefixsumArray(arr);
        System.out.println("enter number of queries:");
        int q=scn.nextInt();
        while(q-->0){
            System.out.println("enter range:");
            int l=scn.nextInt();
            int r=scn.nextInt();
            int ans=prefixsum[r]-prefixsum[l-1];
            System.out.println("sum is"+ ans);

        }
    }
}
