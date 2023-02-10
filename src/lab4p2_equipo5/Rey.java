
package lab4p2_equipo5;


public class Rey extends Pieza{

    public Rey(String coordenadaPieza, int colorPieza, String nombre) {
        super(coordenadaPieza, colorPieza, nombre);
    }

    
    @Override
    public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
        
        return true;
    }
    
}
