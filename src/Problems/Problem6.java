/* Project Euler - Problem 6 (Sum square difference)
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 1² + 2² + ... + 10² = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)² = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural 
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural 
 * numbers and the square of the sum.
 *
 * La suma de los cuadrados de los primeros diez números naturales es,
 * 1² + 2² + ... + 10² = 385
 * El cuadrado de la suma de los primeros diez números naturales es,
 * (1 + 2 + ... + 10)² = 552 = 3025
 * Por lo tanto, la diferencia entre la suma de los cuadrados de los primeros diez números 
 * naturales y el cuadrado de la suma es 3025 - 385 = 2640.
 * Encuentra la diferencia entre la suma de los cuadrados de los primeros cien números 
 * naturales y el cuadrado de la suma.
 * 
 */
package Problems;
/* @author Ángel Sánchez */
public class Problem6 {
    public static void main(String[] args){
        long num = 100;
        long num2 = 100;
        
        long startTime = System.nanoTime();
        
        num = (num * (num + 1)) * ((2*num)+1) / 6;
        num2 = (long) Math.pow((num2 * (num2 + 1)) / 2, 2);
        System.out.println(num2-num);
        
        long endTime = System.nanoTime();
        System.out.println("Duracion: " + (endTime - startTime)/1e6 + " ms"); 
    }
}
