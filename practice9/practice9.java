public class practice9{
    public static void main(String [] args){

        System.out.println(nestParen("(())")); // → true
        System.out.println(nestParen("((()))")); // → true
        System.out.println(nestParen("(((x))")); // → false
    }

        public static boolean nestParen(String t){
            
            if (t.equals("")){ 
                return true;
            }
            if (t.charAt(0) == '(' && t.charAt(t.length()-1) == ')'){
                return nestParen(t.substring(1,t.length()-1)); // move over one
            }
            else{
                    return false;
            }
        }
    }
    