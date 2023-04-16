import java.util.Arrays;
import java.util.Scanner;

public class LargestandSmallest {
    static int [] smallandlarge(int []arr){
        Arrays.sort(arr);

        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 element:");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans=smallandlarge(arr);
        System.out.println("smallest"+ans[0]);
        System.out.println("largest"+ans[1]);

    }
}
