import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res="Yes";

        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                //System.out.println("Yes");
                res="NO";
                break;
            }
        }
        System.out.println(res);
    }
}
