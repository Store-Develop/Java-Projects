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
public class BRException extends RuntimeException {
    
    BRException(){
        this(" Excepcion Lanzada");
    }
    
    BRException(String e){
        super(e+" BRException. Constructor de un parametro de la clase BRException");
    }
    
}
