package lab4p2_equipo5;

public class Peon extends Pieza {

  public Peon() {
  }

  public Peon(String coordenadaPieza, String coordenadaMov, int colorPieza) {
    super(coordenadaPieza, coordenadaMov, colorPieza);
  }

  @Override
  public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
    // boolean por defecto falso para mover la pieza
    boolean check = false;

    // extraer posiciones
    int[] posicionPieza;

    int[] posicionMovPieza;

    // Validacion del tablero con Peon
    if (coordenadaPieza.equals(getCoordenadaPieza())) {

      // Validar que se mueva del color que debe
      if (getColorPieza() == 1) {
        if (((String) tablero[0][0]).equals("p")) {

        }
      } else {

      }
    }

    return check;
  }

  public int[] transformarPosicion(String coordenada) {
    int[] posicionPieza = new int[2];

    String posicionX = Character.toString(coordenada.charAt(0));
    String posicionY = Character.toString(coordenada.charAt(1));

    switch (posicionX) {
      case "a" -> {
        posicionPieza[0] = 0;
      }
      
      case "b" -> {
        posicionPieza[0] = 1;
      }
      
      case "c" -> {
        posicionPieza[0] = 2;
      }
      
      case "d" -> {
        posicionPieza[0] = 3;
      }
      
      case "e" -> {
        posicionPieza[0] = 4;
      }
      
      case "f" -> {
        posicionPieza[0] = 5;
      }
      
      case "g" -> {
        posicionPieza[0] = 6;
      }
      
      case "h" -> {
        posicionPieza[0] = 7;
      }
    }

    return posicionPieza;
  }
}
