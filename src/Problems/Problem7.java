/* Project Euler - Problem 7 (10001st prime)
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 *
 * Al enumerar los primeros seis números primos: 2, 3, 5, 7, 11 y 13, podemos ver que el sexto primo es 13.
 * ¿Cuál es el 10001 número primo?
 * 
 */
package Problems;
/* @author Ángel Sánchez */
public class Problem7 {
    public static void main(String[] args){
        int cont = 0;
        int prime = 0;
        
        long startTime = System.nanoTime();
        for(int i = 2; cont < 10001; i++){
            if(isPrime(i)){
                cont++;
                prime = i;
            }
        }
        long endTime = System.nanoTime();
        System.out.println(cont + ": " + prime);
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
