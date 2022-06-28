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
public class Fibonacci {
    public int fibonacci(int n){
    if(n==0){
        return 0;
    }
    else if (n==1 || n==2){
        return 1;
    }else{
        /*
        int fibonacciAnterior = fibonacci(n-1);
        int fibonacciDosAnterior = fibonacci(n-2);
        int resultadoFibonacci = fibonacciAnterior + fibonacciDosAnterior;
        
        return resultadoFibonacci;
        */
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    }
}
