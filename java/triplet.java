public class triplet {
    static int pairsum(int [] array,int x){
        int count=0;
        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                for (int k=j+1;k<array.length;k++){
                    if(array[i]+array[j]+array[k]==x){
                        count++;
                        System.out.println(array[i]+" "+array[j]+" "+ array[k]);
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] array={1,4,5,6,3};
        System.out.println(pairsum(array,12));

    }
}
