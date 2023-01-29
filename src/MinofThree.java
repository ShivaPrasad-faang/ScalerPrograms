public class MinofThree {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;

        if(a<b & a<c){
            System.out.println(a + " a");
        }else if(b<c){
            System.out.println(b+ " b");
        }else{
            System.out.println(c+ " c");
        }
    }
}
