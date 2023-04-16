import java.util.Scanner;

public class greaterthaninarray {

    public static void main(String[] args) {
        int[] a={1,6,3,8,3,9,45,0,33,55,67,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number :");
        int x=sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                System.out.println(a[i]);
            }
        }

    }
}
