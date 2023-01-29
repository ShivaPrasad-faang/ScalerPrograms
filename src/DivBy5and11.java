import java.util.Scanner;
public class DivBy5and11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int inp = sc.nextInt();
        if(inp%11 ==0 & inp%5==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
