public class RecursionIncreDecreOrder {
    public static void main(String[] args){
        Incre(5);
        System.out.println("***** AND ******");
        Decre(5);
    }
    public static void Incre(int inp){
        if(inp==0){
            return;
        }else{
            System.out.println(inp);
            Incre(inp-1);
        }
    }
    public static void Decre(int inp){
        if(inp==0){
            return;
        }else{
            Decre(inp-1);
            System.out.println(inp);
        }
    }
}
