public class LCMOfTwoNumbers {
    public static void main(String[] args){
        int A=15;
        int B=20;
        int LCM=(A*B)/GCD(A,B);
        System.out.println(LCM);
    }
    public static int GCD(int A, int B){
        if(A==0){
            return B;
        }else{
            return GCD(B%A, A);
        }
    }
}
