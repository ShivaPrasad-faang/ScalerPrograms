public class DecimalToBinnary {
    public static void main(String[] args){
        int A=12;
        int i=0;
        int sum=0;
        while(A>0){
            int digit=A%2;
            //System.out.println(digit);
            sum=sum+(digit*powerr(i));
            //System.out.println(sum);
            A=A/2;
            i++;
        }
        System.out.println(sum);
    }
    public static int powerr(int Inp){
        int sum=1;
        int i=0;
        while(i<Inp){//2
            sum=sum*10;
            i++;
        }
        return sum;
    }
}
