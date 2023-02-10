package lab4p2_equipo5;

public class Peon extends Pieza {
  private boolean comio;
  
  
  @Override
  public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object tablero) {
    boolean check = false;
    
    // Validacion del tablero con Peon
    if(coordenadaPieza.equals(getCoordenadaPieza())) {
      
      if (((String)tablero).equals(" ")) {
        
      }
    }
    
    return check;
  }
}
