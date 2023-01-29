import java.util.Scanner;

public class PalindromicInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();//123
        int sum=num;
        int digit=0;
        int result=0;
        while(num!=0){
            digit=num%10;//3
            result=result*10+digit;//
            num=num/10;
         //   System.out.print(digit);
        }
        //System.out.println(result);
        if(result==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
