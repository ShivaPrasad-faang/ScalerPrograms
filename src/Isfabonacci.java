public class Isfabonacci {
    public static void main(String[] args){
   // 9999999999
        System.out.println(isFabonacci(100));
    }
    public static int isFabonacci(long A){
        if(A==0 | A==1){
            return (int)A;
        }else{
            return isFabonacci(A-1)+isFabonacci(A-2);
        }
    }
}
