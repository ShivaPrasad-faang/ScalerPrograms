import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Inp=sc.nextInt();
        int sum=0;
        for(int i=1;i<=Inp;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
