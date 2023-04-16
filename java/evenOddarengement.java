import java.util.Scanner;

public class evenOddarengement {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the length of array: ");
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int [] ans=new int[n];
            int indx=0;
            for (int i=0;i<n;i++){
                if(arr[i]%2==0){
                    ans[indx]=arr[i];
                    indx++;
                }
            }for (int i=0;i<n;i++){
                if(arr[i]%2!=0){
                    ans[indx]=arr[i];
                    indx++;
                }
            }
            System.out.println("ans array is:");
            for (int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }

        }
    }


