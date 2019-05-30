/*
 * WIP XI Computer Programing 
 */

package IV.Operators;

/**
 *
 * @author sittiwatlcp
 */
public class _3_Logical {
    public static void main(String[] args) {
        int x = 5;
        
        System.out.println("|| : " + (x < 4 || x > 4)); //หรือ
        
        System.out.println("&& : " + (x > 4 && x < 4)); //และ
        
        System.out.println("Normal : " + (x >= 5));
        
        System.out.println("! : " + !(x >= 5)); //นิเสธ
    }
}
