

public class Stringinjava {
    public static void main(String[] args) {
        //simple String 
        // String s="sdrgjkjhg";
        //how to mak new string
        String s1=new String("Utkash Tiwari");
        //array by using ascii values
        byte[] arr={115,114,113,50,97,98,100,101};
        String s3=new String(arr);
        String s4=new String(arr,1,4);
        System.out.println(s3);
        System.out.println(s4);

        char[] chh={'a','b','c'};
        int l=s.length();
        char c1=s.charAt(2);
            //concatinating two strings
        String str="mohit";
        String s2="sharma";
        String result=str.concat(s2);
        String substr=str.substring(1);
        System.out.println(substr);
        System.out.println(result);
        
        StringBuffer strbuff=new StringBuffer();
strbuff.append("hello");
strbuff.append("guys");
String s=strbuff.toString();
    }
}
