/* Project Euler - Problem 4 (Largest palindrome product)
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Un número palindrómico dice lo mismo en ambos sentidos. 
 * El palíndromo más grande hecho a partir del producto de dos números de 2 dígitos es 9009 = 91 × 99.
 * Encuentra el palíndromo más grande hecho con el producto de dos números de 3 dígitos.
 */
package Problems;

/* @author Ángel Sánchez */
public class Problem4 {
    
    public static void main(String[] args){
        int num;
        int palindromos;
        int palindromoMayor = 0;
        
        for(int i = 999; i > 99; i--){
            for(int j = 999; j > 99; j--){
                num = i * j;
                if(isPalindrome(num)){
                    System.out.println(i+"*"+j+"=" +num);
                    palindromos = num;
                    if(palindromoMayor < palindromos){
                        palindromoMayor = palindromos;
                    }
                }
            }
        }
        System.out.println(palindromoMayor);
    }
    
    public static boolean isPalindrome(int num){
        String number1 = String.valueOf(num);
        String number2 = "";
        while(num > 10){
            number2 += String.valueOf(num%10);
            num = (num - (num%10)) / 10;
        }
        number2 += String.valueOf(num);
        if(number1.equals(number2)){
            return true;
        }else{
            return false;
        }
    }
}
