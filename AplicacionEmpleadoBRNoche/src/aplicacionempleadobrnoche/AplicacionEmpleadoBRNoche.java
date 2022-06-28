/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionempleadobrnoche;

/**
 *
 * @author Lenovo
 */
public class AplicacionEmpleadoBRNoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float salarioBruto = 200;
         EmpleadoBR objetoEmpleadoBR = new EmpleadoBR();
         
         System.out.println("Prueba del método calculaSalarioNeto con salarioBruto= "+salarioBruto);
         System.out.println("El salario Neto para un empleado con salarioBruto de: "+salarioBruto+ " es: "+objetoEmpleadoBR.calculaSalarioNeto(salarioBruto));
    
         salarioBruto = 1100;
         System.out.println("Prueba del método calculaSalarioNeto con salarioBruto= "+salarioBruto);
         System.out.println("El salario Neto para un empleado con salarioBruto de: "+salarioBruto+ " es: "+objetoEmpleadoBR.calculaSalarioNeto(salarioBruto));
    
         salarioBruto = 5000;
         System.out.println("Prueba del método calculaSalarioNeto con salarioBruto= "+salarioBruto);
         System.out.println("El salario Neto para un empleado con salarioBruto de: "+salarioBruto+ " es: "+objetoEmpleadoBR.calculaSalarioNeto(salarioBruto));
    
    
         salarioBruto = -1;
         System.out.println("Prueba del método calculaSalarioNeto con salarioBruto= "+salarioBruto);
         System.out.println("El salario Neto para un empleado con salarioBruto de: "+salarioBruto+ " es: "+objetoEmpleadoBR.calculaSalarioNeto(salarioBruto));
    
}
    
}
