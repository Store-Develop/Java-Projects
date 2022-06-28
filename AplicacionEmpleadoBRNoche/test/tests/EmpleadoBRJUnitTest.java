/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import aplicacionempleadobrnoche.EmpleadoBR;
import org.junit.Assert;
import aplicacionempleadobrnoche.BRException;

/**
 *
 * @author Lenovo
 */
public class EmpleadoBRJUnitTest {
    
    static EmpleadoBR objetoPruebaEmpleado;
    
    public EmpleadoBRJUnitTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        objetoPruebaEmpleado = new EmpleadoBR();
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void calculaSalarioNeto1(){
        Assert.assertEquals(0, objetoPruebaEmpleado.calculaSalarioNeto(0), 0.01);
    }
    
    @Test
    public void calculaSalarioNeto2(){
        Assert.assertEquals(500, objetoPruebaEmpleado.calculaSalarioNeto(500), 0.01);
    }
    
    
    @Test
    public void calculaSalarioNeto3(){
        Assert.assertEquals(999.99, objetoPruebaEmpleado.calculaSalarioNeto((float)999.99), 0.01);
    }
    
        
    @Test
    public void calculaSalarioNeto4(){
        Assert.assertEquals(840, objetoPruebaEmpleado.calculaSalarioNeto(1000), 0.01);
    }
    
            
    @Test
    public void calculaSalarioNeto5(){
        Assert.assertEquals(1050, objetoPruebaEmpleado.calculaSalarioNeto(1250), 0.01);
    }
    
    @Test
    public void calculaSalarioNeto6(){
        Assert.assertEquals(1259.9916, objetoPruebaEmpleado.calculaSalarioNeto((float)1499.99), 0.01);
    }
    
    @Test
    public void calculaSalarioNeto7(){
        Assert.assertEquals(1230, objetoPruebaEmpleado.calculaSalarioNeto(1500), 0.01);
    }
    
    @Test
    public void calculaSalarioNeto8(){
        Assert.assertEquals(1640, objetoPruebaEmpleado.calculaSalarioNeto(2000), 0.01);
    }
    
    @Test(expected=BRException.class)
    public void calculaSalarioNeto9(){
        objetoPruebaEmpleado.calculaSalarioNeto(-1);
    }
    
    @Test
    public void calculaSalarioNeto10(){
        try{
            objetoPruebaEmpleado.calculaSalarioNeto(-4);
            fail("El método produce BRException");
        }
        catch(BRException e){}
    }
    
}
