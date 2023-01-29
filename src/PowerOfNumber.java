import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numb = sc.nextInt();
        int power = sc.nextInt();
        int sum=1;

        for(int i=0;i<power;i++){
            sum=sum*numb;
        }
        System.out.println(sum);
    }
}
