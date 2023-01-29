import java.util.Scanner;

public class PercentageAndGrades {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();

        int percentage=(A+B+C+D+E)/5;
        if(percentage>=90){
            System.out.print(percentage+" "+"A");
        }else if(percentage>=80 & percentage<90){
            System.out.print(percentage+" "+"B");
        }else if(percentage>=70 & percentage<80){
            System.out.print(percentage+" "+"C");
        }else if(percentage>=60 & percentage<70){
            System.out.print(percentage+" "+"D");
        }else if(percentage>=40 & percentage<60){
            System.out.print(percentage+" "+"E");
        }else if(percentage<40){
            System.out.print(percentage+" "+"F");
        }
    }
}
