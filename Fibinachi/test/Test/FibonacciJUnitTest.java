/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;
import fibinachi.Fibonacci;
import static java.awt.SystemColor.text;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jkml5
 */
public class FibonacciJUnitTest {
    
    public FibonacciJUnitTest() {
    }
    
    static Fibonacci objetoPruebaFibonacci;
    @BeforeClass
    public static void setUpClass(){
    objetoPruebaFibonacci = new Fibonacci();
    }
    
    public void returnZeroIfReceiveZero(){
        Assert.assertEquals(0, objetoPruebaFibonacci.fibonacci(0));
    }
    
    
            
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
