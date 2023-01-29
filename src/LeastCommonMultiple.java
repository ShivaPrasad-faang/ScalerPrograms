import java.lang.*;
import java.util.*;
public class LeastCommonMultiple {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int ans =0;
        for(int i=0;i<T;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            //System.out.print(LCM(A,B));
            ans = (A*B)/GCD(A,B);
            System.out.println(ans);
        }
    }
    public static int GCD(int A, int B){
        if(A==0){
            return B;
        }else{
            return GCD(B%A,A);
        }
    }
}
