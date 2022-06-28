
package clases;


public class ClaseHija_Deposito extends ClasePadre_Abstracta{
    @Override
    public void Transacciones(){
        System.out.println("Cuanto deseas depositar");
        Deposito();
        
        transaccion = getSaldo();
        setSaldo(transaccion + deposito);
        System.out.println("-----------------------------------");
        System.out.println("Depositaste: "+ deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------");
    }
    
}
