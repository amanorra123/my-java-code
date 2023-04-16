import java.util.Scanner;

public class lastoccurance {
    static int occurace(int[]array,int x){
        int index=-1;
        for(int i=0;i< array.length;i++){
            if(array[i]==x){
                index=i;
            }
        } return index;
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,5,5,7,8,9};
        System.out.println("enter the number to count the last index:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(occurace(array,x));

    }
}
