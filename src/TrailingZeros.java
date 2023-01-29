public class TrailingZeros {
    public static void main(String[] args){
        int Inp=120;
        int power=5;
        int sum=0;
        while(Inp%power==0){
            sum=sum+1;
            power=power*5;
        }
        System.out.println(sum);
    }
}
