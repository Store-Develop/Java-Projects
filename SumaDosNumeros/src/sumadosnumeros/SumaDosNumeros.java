
package sumadosnumeros;

import java.util.Scanner;

public class SumaDosNumeros {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int NumUno = 0;
        int NumDos = 0;
        int Resultado =0;
        
        System.out.println("Ingrese el primer numero:");
        NumUno = Entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        NumDos = Entrada.nextInt();
        
        Resultado = NumUno + NumDos;
        
        System.out.println("El resultado de la suma es:" + Resultado);
    }
    
}
