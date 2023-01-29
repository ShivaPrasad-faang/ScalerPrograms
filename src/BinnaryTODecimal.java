import java.util.Scanner;

public class BinnaryTODecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int result=0;
        while(a!=0){
            int digit=a%10;//1
            result= result+(digit*powerr(i));//1
            a=a/10;//101
            i++;//1
        }
       // result= powerr(0);
        System.out.println(result);
    }
    public static int powerr(int inp){
        int sum=1;
        for(int i=0;i<inp;i++){
            sum=sum*2;
        }
        return sum;
    }
}
