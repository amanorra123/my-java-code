import java.util.Scanner;

class index{
    void show(int a){
        int[] array={1,3,5,8,0,4,7,34,87,99,5,100};
        int ans=-1; int x=a;
        for (int i=0;i<array.length;i++){
            if(array[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("value is found at index "+ans);
    }
}
public class indexFound {
    public static void main(String[] args) {
      index obj= new index();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to search: ");
        int a=sc.nextInt();
      obj.show(a);
    }
}
