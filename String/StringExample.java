
public class StringExample{
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2); 
        System.out.println(s1 == s3); 

        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println(original); 
        System.out.println(modified); 
        
    } 
}