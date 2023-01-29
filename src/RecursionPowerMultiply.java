public class RecursionPowerMultiply {
    public static void main(String[] args){
        System.out.println(pwr(3,3));
        System.out.println(multiply(3,3));
    }
    public static int pwr(int a, int b){
        if(b==0){
            return 1;
        }else{
           return a*pwr(a,b-1);//(2,2)//(2,1)//()
        }
    }
    public static int multiply(int a,int b){
        if(b==1){
            return a;
        }else{
            return a+multiply(a,b-1);
        }
    }
}
