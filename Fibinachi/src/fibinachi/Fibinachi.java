/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibinachi;

/**
 *
 * @author jkml5
 */
public class Fibinachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prueba de fibonacci para n=12");
        Fibonacci miObjetoFibonacci = new Fibonacci();
        System.out.println("El resultado Fibonacci es"+ miObjetoFibonacci.fibonacci(12));
    }
    
}
