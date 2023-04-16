public class targetsum {
    static int pairsum(int [] array,int x){
        int count=0;
        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==x){
                    count++;
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] array={4,7,3,21,6,5,5};
        System.out.println(pairsum(array,10));

    }
}
