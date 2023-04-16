class sum{
    void demo()

    {


        int[] arr = {1, 4, 5, 8, 3};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

}
public class GreaterOfArray {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.demo();
       

    }
}