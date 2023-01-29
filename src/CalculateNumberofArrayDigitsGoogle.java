public class CalculateNumberofArrayDigitsGoogle {
    public static void main(String[] args){
        int Arr[] = {3,2,4,6,3};
        int sum=0;
        for(int i=0;i< Arr.length;i++){
           // sum=(Arr[i]*10)+sum;
            sum=((sum%4*10)%4+Arr[i]%4)%4;//30+2
        }
        System.out.println(sum%4);

    }
}
