/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poliinternacional.negocio;

import com.poliinternacional.dto.numerosdto;

/**
 *
 * @author Politecnico
 */
public class OperacionesBasicas {
    private int numero1;
    private int numero2;
    private String operacion;  
    
    public OperacionesBasicas(){
       
    }
    
    public OperacionesBasicas(int numero1, int numero2, String operacion){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }
    
    private int suma(){
        return numero1 + numero2;
    }
    
     private int suma(int n1,int n2){
        return n1 + n2;
    }
    
    private int resta(){
        return numero1 - numero2;
    }
    
     private int resta(int n1,int n2){
        return n1 - n2;
    }
    
     private int multiplicacion(){
        return numero1 * numero2;
    }
     
     private int multiplicacion(int n1, int n2){
        return n1 * n2;
    }
    private int division(){
        return numero1 /numero2;
    }
    
     private int division(int n1, int n2){
        return n1 /n2;
    }
    
    public int resultado(){
        int resp = 0;
        switch(operacion){
            case "suma":
                        resp = suma();
                        break;
            case "resta":
                        resp = resta();
                        break;
            case "multiplicacion":
                        resp = multiplicacion();
                        break;
            case "division":
                        resp = division();
                        break;
        }
        
        
        return resp;
    }
    
     public int resultado(numerosdto datos){
        int resp = 0;
        switch(datos.getOperacion()){
            case "suma":
                        resp = suma(datos.getNumero1(),datos.getNumero2());
                        break;
            case "resta":
                        resp = resta(datos.getNumero1(),datos.getNumero2());
                        break;
            case "multiplicacion":
                        resp = multiplicacion(datos.getNumero1(),datos.getNumero2());
                        break;
            case "division":
                        resp = division(datos.getNumero1(),datos.getNumero2());
                        break;
        }
        
        
        return resp;
    }
    
    
}
