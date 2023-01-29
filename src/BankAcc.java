import java.util.Scanner;
public class BankAcc {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int amount=sc.nextInt();
       int type=sc.nextInt();
       int addAmt=sc.nextInt();

       if(type==1){
            System.out.println(amount+addAmt);
       }else if(type==2){
           if((amount-addAmt)>0) {
               System.out.println(amount - addAmt);
           }else{
               System.out.println("Insufficient Funds");
           }
           }
       }
    }