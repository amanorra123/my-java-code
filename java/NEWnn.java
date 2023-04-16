import java.util.Scanner;

public class NEWnn {
    static int print(int[] array,int x){
        int index=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==x){
                index++;
            }
        }return index;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,7,6,4,5,7,8,9,6,7,8,7,8,7,8,7,8,9};
        System.out.println(" enter number to search:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(print(array,x));


    }
}
