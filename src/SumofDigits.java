import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        for(int i=0;i<2;i++){//
            int sum=0;
            int inside_inp = sc.nextInt();//1001
            while(inside_inp!=0) {
                int digit = inside_inp % 10;//1
                sum = sum + digit;//1
                inside_inp = inside_inp / 10;//100
            }
            System.out.println(sum);
        }
    }
}
