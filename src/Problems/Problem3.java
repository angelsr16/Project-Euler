/* Project Euler - Problem 3 (Largest prime factor)
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * Los factores primos de 13195 son 5, 7, 13 y 29.
 * ¿Cuál es el factor primo más grande del número 600851475143?
 */

package Problems;

/* @author Ángel Sánchez */
public class Problem3 {
    
    public static void main(String[] args){
        long num = 600851475143L;
        long i = 2;
        long prime = 0;
        
        long startTime = System.nanoTime();
        
        while(num > 1){
            if(isPrime(i) && num % i == 0){
                while(num % i == 0){
                    num /= i;
                }
                prime = i;
                System.out.println("Factores primos: " + i);
            }
            i++;
        }
        System.out.println("El factor primo mas grande es: " + prime); 
        
        long endTime = System.nanoTime();
        
        System.out.println("Duracion: " + (endTime - startTime)/1e6 + " ms");
    }
    
    public static boolean isPrime(long num){
        for(long i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
