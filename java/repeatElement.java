import java.util.Scanner;

public class repeatElement {
    static int repeat(int arr[]){

        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                  return  arr[i];
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 element:");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("First repeated number is:"+repeat(arr));
    }
}
