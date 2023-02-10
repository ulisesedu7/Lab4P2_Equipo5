package lab4p2_equipo5;

public class Peon extends Pieza {

  public Peon() {
  }

  public Peon(String coordenadaPieza, int colorPieza, String nombre) {
    super(coordenadaPieza, colorPieza, nombre);
  }

  @Override
  public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
    // boolean por defecto falso para mover la pieza
    boolean check = false;

    // extraer posiciones
    int[] posicionPieza = transformarPosicion(coordenadaPieza);
    int posicionPiezaX = posicionPieza[0];
    int posicionPiezaY = posicionPieza[1];

    // Valor ascii de la pieza que el usuario esta moviendo
    int asciiPieza = ((char) tablero[posicionPiezaX][posicionPiezaY]);

    int[] posicionMovPieza = transformarPosicion(coordenadaMov);
    int posicionMovPiezaX = posicionMovPieza[0];
    int posicionMovPiezaY = posicionMovPieza[1];

    // valor ascii de la pieza que desea mover en el tablero
    int asciiPiezaMov = ((char) tablero[posicionMovPiezaX][posicionMovPiezaY]);

    // Validacion del tablero con Peon
    if (coordenadaPieza.equals(getCoordenadaPieza())) {

      if (tablero[posicionMovPiezaX][posicionMovPiezaY].equals(" ")) {
        // Validar que se mueva del color que debe
        if (getColorPieza() == 0) {
          // Check que no haya una pieza del mismo jugador en esa posicion
          if (asciiPiezaMov >= 65 || asciiPiezaMov <= 90) {
            if (posicionPiezaX != 1) {
              if (posicionMovPiezaY - posicionPiezaY == 1) {
                check = true;
              }
            } else {
              if (posicionMovPiezaY - posicionPiezaY == 1 || posicionMovPiezaY - posicionPiezaY == 2) {
                check = true;
              }
            }
          }
        } else {
          if (asciiPiezaMov >= 97 || asciiPiezaMov <= 122) {
            if (posicionPiezaX != 1) {
              if (posicionMovPiezaY - posicionPiezaY == 1) {
                check = true;
              }
            } else {
              if (posicionMovPiezaY - posicionPiezaY == 1 || posicionMovPiezaY - posicionPiezaY == 2) {
                check = true;
              }
            }
          }
        }
      } else { // Valicar si desea comer o no
        if (getColorPieza() == 0) {
          if (asciiPiezaMov >= 65 || asciiPiezaMov <= 90) {
            if (posicionMovPiezaY - posicionPiezaY == 1 && posicionMovPiezaX - posicionPiezaX == 1) {
              check = true;
              setComio(true);
              setPiezaComida(((Pieza) tablero[posicionMovPiezaX][posicionMovPiezaY]).getNombre());
            }
          } else {
            if (asciiPiezaMov >= 97 || asciiPiezaMov <= 122) {
              if (posicionMovPiezaY - posicionPiezaY == 1 && posicionMovPiezaX - posicionPiezaX == 1) {
                check = true;
                setComio(true);
                setPiezaComida(((Pieza) tablero[posicionMovPiezaX][posicionMovPiezaY]).getNombre());
              }
            }
          }
        }
      }
    }

    return check;
  }

  public int[] transformarPosicion(String coordenada) {
    int[] posicionPieza = new int[2];

    String posicionX = Character.toString(coordenada.charAt(0));
    int posicionY = Character.getNumericValue(coordenada.charAt(1));

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

    posicionPieza[1] = posicionY - 1;

    return posicionPieza;
  }
}
