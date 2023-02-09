import java.util.Scanner;

public class CountOfPrimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int inpp=sc.nextInt();
       // System.out.println(isPrime(inpp));
        int count=0;
        for(int i=2;i<=inpp;i++){
            if(isPrimes(i)==true){
                count=count+1;
            }
        }
        System.out.println(count);
    }
    public static int isPrime(int inp){//3
        int result=0;
        for(int i=2;i<inp;i++){
            if(inp%i==0){
                result=1;
                return result;
            }
        }
        return result;
    }
    public static boolean isPrimes(int Inp){
        int i=2;
        boolean result=true;
        for(;i*i<Inp;i++){
            if(Inp%i==0){
                result=false;
                return result;
            }
        }
        return result;
    }

}
