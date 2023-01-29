import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            int Inp=sc.nextInt();
            int j=1;
            int sum=0;
            while(j<Inp){
                if(Inp%j==0){
                    sum=sum+j;
                }
                j++;
            }
            if(sum==Inp){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }


    }
}
