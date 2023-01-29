import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        for(int i=2;i<=input;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
