public class MagicNumberof5 {
    public static void main(String[] args){
       // System.out.println(powerr(4));
        int Inp=7;
        int sum=0;
        int i=1;
        while(Inp>0){
            int digit= Inp%2;
           //System.out.println(digit);
           // System.out.println(digit);
           // System.out.println(powerr(i));
            sum=sum+(digit*powerr(i));
            Inp=Inp/2;
            i++;
        }
        System.out.println(sum);
    }

    public static int powerr(int Inp){
        int sum=1;
        for(int i=1;i<=Inp;i++){
            sum=sum*5;
        }
        return sum;
    }
}
