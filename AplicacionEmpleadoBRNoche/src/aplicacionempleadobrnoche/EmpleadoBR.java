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
public class EmpleadoBR {
    
    public void calculaSalarioBruto(){
        
    }
    
    public float calculaSalarioNeto(float salarioBruto) throws BRException{
        
        float porcentajeDescuento = 0;
        float valorDescuento = 0;
        float salarioFinal = 0;
        
        if (salarioBruto >= 1500){
            porcentajeDescuento = (float)18/100;
            valorDescuento = salarioBruto * porcentajeDescuento;
            salarioFinal = salarioBruto - valorDescuento;
            return salarioFinal;  
        }
        else if(salarioBruto >= 1000 && salarioBruto < 1500){
            porcentajeDescuento = (float)16/100;
            valorDescuento = salarioBruto * porcentajeDescuento;
            salarioFinal = salarioBruto - valorDescuento;
            return salarioFinal;
        }
        else if (salarioBruto < 0){
            throw new BRException("Salario Menor que Cero");
        }
        else{
            return salarioBruto;
        }
      
    }
    
}
