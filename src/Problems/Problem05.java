/* Project Euler - Problem 5 (Smallest multiple)
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * 2520 es el número más pequeño que se puede dividir por cada uno de los números del 1 al 10 sin ningún resto.
 * ¿Cuál es el número positivo más pequeño que es uniformemente divisible por todos los números del 1 al 20?
 * 
 */
package Problems;

/* @author Ángel Sánchez */
public class Problem05 {
    
    public static void main(String[] args){
        int num = 21;
        
        long startTime = System.nanoTime();
        while(!isMultiple(num)){
            num++;
        }
        long endTime = System.nanoTime();
        
        System.out.println(num);
        System.out.println("Duracion: " + (endTime - startTime)/1e6 + " ms");
    }
    
    public static boolean isMultiple(int num){
        for(int i = 1; i <= 20; i++){
            if(!(num % i == 0)){
                return false;
            }
        }
        return true;
    }
    
}
