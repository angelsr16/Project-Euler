/* Project Euler - Problem 1 (Multiples of 3 and 5)
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * Si enumeramos todos los números naturales por debajo de 10 que son múltiplos de 3 o 5,
 * obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.
 * Encuentra la suma de todos los múltiplos de 3 o 5 debajo de 1000.
 */

package Problems;

/* @author Ángel Sánchez */
public class Problem1 {
    
    public static void main(String[] args){
        int suma = 0;
        
        long startTime = System.nanoTime();
        
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma);
        
        long endTime = System.nanoTime();
        
        System.out.println("Duracion: " + (endTime - startTime)/1e6 + " ms");
    }
    
}
