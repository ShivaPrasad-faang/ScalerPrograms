public class RecurtionSumofEven {
    public static void main(String[] args){
    System.out.println(SumEven(2));
    }

    public static int SumEven(int inp){//5
        if(inp==0){
            return 0;
        }else{
            if(inp%2==0) {
                //System.out.println(inp);
               return inp+SumEven(inp - 1);
            }else{
                return SumEven(inp - 1);
            }
        }
    }
}
