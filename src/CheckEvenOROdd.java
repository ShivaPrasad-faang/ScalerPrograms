import java.util.Scanner;
public class CheckEvenOROdd {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int inp = sc.nextInt();
        if(inp%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
