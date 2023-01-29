import java.util.Scanner;
public class PrintPrimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=2;i<N;i++){
            if(isPrime(i)==1) {
                System.out.println(i);
            }
        }

    }
    static int isPrime(int Inp){//10
        int i=2;
        int result=0;
        for(;i<Inp;i++){
            if(Inp%i==0){
                break;
            }
        }
        if(Inp==i) {
            result= 1;
        }
        return result;
    }
}
