public class ModString {
    public static void main(String[] args){
       String A = "43535321";
       int B = 47;
       long sum=0;
       for(int i=0;i<A.length();i++){
           //int a = Integer.parseInt(A.charAt(i)+" ");
           sum= ((sum*10)+A.charAt(i));
         //  System.out.println(sum);
       }
       int a=20;
       int b=30;
       int c=50;
        //String a =aa+""+bb;
        // System.out.println(Integer.parseInt(a));
        //String Inp="";
        if(a<b & a<c){
            System.out.println(a);
        }else if(b<a & b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}



