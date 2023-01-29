import java.util.Scanner;
public class PTRby100 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();

        double result = (P*T*R)/100;
        System.out.println(result);

    }
}
