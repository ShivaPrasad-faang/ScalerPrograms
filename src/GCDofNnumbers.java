import java.util.Scanner;

public class GCDofNnumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Inp=sc.nextInt();
        int Inp2=sc.nextInt();
        int sum=GCD(Inp,Inp2);
        for(int i=1;i<2;i++){
            Inp2=sc.nextInt();
            sum=GCD(sum,Inp2);
        }
        System.out.println(sum);
    }
    public static int GCD(int a,int b){
        if(a==0){
            return b;
        }else{
            return GCD(b%a,a);
        }
    }
}


