import java.util.Scanner;

public class Findprefixorsufixsame {
    static int findArraySum(int [] arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
        static boolean EqualSumPartition(int [] arr){
        int totalsum=findArraySum(arr);
        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            int sufixsum=totalsum-prefixsum;
            if(prefixsum==sufixsum){
                return true;
            }
        }
        return false;
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        System.out.println("enter the element of the array");
        int[] arr = new int[n];
        for(int i=0;i< n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("equal partition possible:" + EqualSumPartition(arr));
    }
}
