import java.util.Arrays;
import java.util.Scanner;

public class JAVA {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
                int n = scn.nextInt();
                System.out.println("enter the element of the array");
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        }
                int [] ans=new int[n];
                for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr.length;j++){
                        if(i==j){
                            ans[i]=arr[i]*arr[j];

                        }
                    }
                }
        Arrays.sort(ans);
                for(int i=0;i<arr.length;i++){
                    System.out.print(ans[i]+" ");
                }

    }
}