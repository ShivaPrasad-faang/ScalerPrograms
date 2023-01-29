import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int R=sc.nextInt();
           System.out.println(countDigits(R));
        }
    }
    static int countDigits(int A){
        int digit=0;
        while(A!=0){
            digit=digit+1;
            A=A/10;
        }
        return digit;
    }
}
