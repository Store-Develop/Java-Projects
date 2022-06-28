package aplicacionpunto1;

import java.awt.*;

public class Punto {

    private int x; // variable para la coordenada en x
    private int y; // variable para la coordenada en y
    private static int puntos = 0;

    public Punto() { // método para construir un objeto sin parámetros
        x = 0;
        y = 0;
        puntos++;
    }
// método para construir un objeto con valores enteros

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        puntos++;
    }

// método para construir un objeto con valores double
    public Punto(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
        puntos++;
    }

// método para construir un objeto con otro objeto
    public Punto(Punto obj) {
        this.x = obj.obtenX();
        this.y = obj.obtenY();
        puntos++;
    }
}

// método que da el valor de la coordenada x
public int obtenX() {  
return x;
}

// método que da el valor de la coordenada y
public int obtenY() {  
return y;
}
// método que sirve para cambiar el valor //de la coordenada x
public void cambiaX(int x) {
this.x = x;  // this se usa porque se está utilizando (x)
// como parámetro y como 
// variable de instancia y esto es para que no se confunda
}
  // método que sirve para cambiar el valor de la coordenada y
public void cambiaY(int y) {
this.y = y; // this se usa porque se está utilizando (y)
//como parámetro y como 
 // variable de instancia y esto es para que no se confunda Java
}

// dibujar un punto
public void dibujaPunto(Graphics g) {
g.fillOval(x,y, 5, 5);
}

// para obtener un objeto Punto en formato String
public String toString() {
return "(" + obtenX() + "," + obtenY() + ")";
}

// para acceder a la cantidad de objetos creados
public static int getPuntos() {
return puntos;
}

}
}
