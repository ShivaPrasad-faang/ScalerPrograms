public class Recursion_Factorial {
    public static void main(String[] args){
        System.out.println(rec(5));
    }

    public static int rec(int inp){

        if(inp==0){
            return 1;
        }else{
            return inp*rec(inp-1);
        }

    }
}
