public class AddDigits {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int d=num%10;
            sum=sum+d;
            num=num/10;
        }
        return sum;
    }
}


