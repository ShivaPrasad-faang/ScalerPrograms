public class GCDEuclidsAlgo {
    public static void main(String[] args){
        int a=90;
        int b=55;
        System.out.println(GCD(a,b));
    }
    public static int GCD(int a, int b){
        if(a==0){
            return b;
        }else{
            return GCD(b%a,a);
        }
    }
}
