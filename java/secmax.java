import java.util.Arrays;
import java.util.Scanner;

public class secmax {
    static int [] smallandlarge(int []arr){
        Arrays.sort(arr);

        int[] ans={arr[1],arr[arr.length-2]};
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
        System.out.println("second smallest:"+ans[0]);
            System.out.println("second largest:"+ans[1]);
        }
    }

