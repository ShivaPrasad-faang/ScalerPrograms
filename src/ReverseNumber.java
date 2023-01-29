public class ReverseNumber {
    public static void main(String[] args){
        int inp =10012;
        int sum=0;
        while(inp!=0){
            int digit=inp%10;
            sum=(sum*10)+digit;
            inp=inp/10;
        }
        System.out.println(sum);
    }
}
