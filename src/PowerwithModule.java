public class PowerwithModule {
    public static void main(String[] args){
        //power(a,n,p);//an%p
        System.out.println(power(9,4000,6));
    }
    public static int power(int A,int N, int P){
        long sum=1;
        for(int i=0;i<N;i++){
            sum=((sum%P)*A)%P;
        }
        return (int) (sum%P);
    }
}
