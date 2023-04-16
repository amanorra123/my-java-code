public class uniqueElement {
    static int unique(int a[]){
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=a[j]=-1;
                }
            }

        }
        int ans=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>0){
                ans=a[i];
                System.out.print(ans+" ");
            }
        } return ans;
    }
    public static void main(String[] args) {
        int a[]={4,3,5,2,3,4,4,4,5,6};
//        System.out.println(unique(a));
        unique(a);
    }
}
