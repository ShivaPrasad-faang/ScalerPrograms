public class VowelsOrConsonant {
    public static void main(String[] args){
        System.out.println(Fvowel('b'));
    }
    public static int Fvowel(char inp){
        int result =0;
        if(inp=='a'){
            result =1;
        }else if(inp=='e'){
            result =1;
        }else if(inp=='i'){
            result =1;
        }else if(inp=='o'){
            result =1;
        }else if(inp=='u'){
            result =1;
        }
        return result;
    }
}
