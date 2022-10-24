package js9;

/*
 * @author Ghenta Alif Alde_21343048
 */

public class latihan3 {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "free the bound periodicals.";
        str2 = str1;
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        str2 = new String(str1);
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        System.out.println("Same object? " + str1.equals(str2));
    }
}
