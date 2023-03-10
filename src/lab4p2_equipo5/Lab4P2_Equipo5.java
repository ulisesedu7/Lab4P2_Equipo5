package lab4p2_equipo5;

import java.util.*;

public class Lab4P2_Equipo5 {

  public static Object[][] tablero = new Object[8][8];
  public static String entrada;
  public static Scanner leer = new Scanner(System.in);

  public static void main(String[] args) {
    tableroInicial();
    crearTablero();

    menu();
  }

  public static void menu() {
    int resp = 0;

    do {
      System.out.println("-----CHESS------");
      System.out.println("1- Jugar");
      System.out.println("2- Salir");
      System.out.println("Ingrese una opcion: ");
      resp = leer.nextInt();

      if (resp == 1) {
        System.out.println("Nombre del primer jugador: [piezas blancas]");
        leer.nextLine();
        String jugador1 = leer.nextLine();
        System.out.println("Nombre del segundo jugador: [piezas negras]");
        String jugador2 = leer.nextLine();

        game();
      }
    } while (resp != 2);
  }

  public static void game() {
    System.out.println("Este es el tablero: ");
    imprimirTablero(tablero);

    do {
      System.out.println("Ingrese la coordenada en el formato: ");

      entrada = leer.nextLine();
        if (!entrada.equals("gusbai")) {
            
            // Llamar a los comands
            if (validarFormato(entrada)==true) {
                String[] comandos = comandos(entrada);

                String coordenadaPieza = comandos[0];
                String coordenadaPiezaMov = comandos[1];

                // Posicion en ints
                int[] posicionPieza = transformarPosicion(coordenadaPieza);
                int posicionPiezaX = posicionPieza[0];
                int posicionPiezaY = posicionPieza[1];

                // Posicion en ints de pieza a mover
                int[] posicionPiezaMov = transformarPosicion(coordenadaPiezaMov);
                int posicionMovPiezaX = posicionPiezaMov[0];
                int posicionMovPiezaY = posicionPiezaMov[1];

                if (tablero[posicionPiezaX][posicionPiezaY] instanceof Pieza) {
                  boolean checkMov = ((Pieza) tablero[posicionPiezaX][posicionPiezaY]).movimiento(coordenadaPieza, coordenadaPiezaMov, tablero);

                  if (checkMov) {
                    tablero[posicionMovPiezaX][posicionMovPiezaY] = tablero[posicionPiezaX][posicionPiezaY];
                    tablero[posicionPiezaX][posicionPiezaY] = " ";

                    imprimirTablero(tablero);
                  } else {
                    System.out.println("Mov incorrecto");
                  }
                } else {
                  System.out.println("Seleccionaste un espacio vacio");
                }
            }
        }
                

    } while (!entrada.equals("gusbai"));

  }

  public static void imprimirTablero(Object[][] tablero) {
    System.out.println("--Tablero--");

    System.out.print("   A   B   C   D   E   F   G   H");

    // For para msotrar tablero
    for (int row = 0; row < tablero.length; row += 1) {
      System.out.println("");
      System.out.print(row + 1 + " ");
      for (int col = 0; col < tablero[row].length; col += 1) {
        if (tablero[row][col] instanceof Pieza) {
          System.out.print("[" + ((Pieza) tablero[row][col]).getNombre() + "] ");
        } else {
          System.out.print("[" + tablero[row][col] + "] ");
        }
      }
    }

    System.out.println();
    System.out.println();
  }

  // Metodo para tablero
  public static void tableroInicial() {
    // Rellenar de espacios vacios
    for (int row = 0; row < tablero.length; row += 1) {
      for (int col = 0; col < tablero[row].length; col += 1) {
        tablero[row][col] = " ";
      }
    }
  }

  public static void crearTablero() {
    tablero[1][0] = new Peon("a2", 1, "P");
    tablero[1][1] = new Peon("b2", 1, "P");
    tablero[1][2] = new Peon("c2", 1, "P");
    tablero[1][3] = new Peon("d2", 1, "P");
    tablero[1][4] = new Peon("e2", 1, "P");
    tablero[1][5] = new Peon("f2", 1, "P");
    tablero[1][6] = new Peon("g2", 1, "P");
    tablero[1][7] = new Peon("h2", 1, "P");

    tablero[6][0] = new Peon("a7", 0, "p");
    tablero[6][1] = new Peon("b7", 0, "p");
    tablero[6][2] = new Peon("c7", 0, "p");
    tablero[6][3] = new Peon("d7", 0, "p");
    tablero[6][4] = new Peon("e7", 0, "p");
    tablero[6][5] = new Peon("f7", 0, "p");
    tablero[6][6] = new Peon("g7", 0, "p");
    tablero[6][7] = new Peon("h7", 0, "p");

    tablero[0][0] = new Torre("a1", 1, "T");
    tablero[0][7] = new Torre("h1", 1, "T");

    tablero[7][0] = new Torre("a8", 0, "t");
    tablero[7][7] = new Torre("h8", 0, "t");

    tablero[0][1] = new Caballo("b1", 1, "C");
    tablero[0][6] = new Caballo("g1", 1, "C");

    tablero[7][1] = new Caballo("b8", 0, "c");
    tablero[7][6] = new Caballo("g8", 0, "c");

    tablero[0][2] = new Alfil("c1", 1, "A");
    tablero[0][5] = new Alfil("f1", 1, "A");
    tablero[7][2] = new Alfil("c8", 0, "a");
    tablero[7][5] = new Alfil("f8", 0, "a");

    tablero[0][4] = new Rey("e1", 1, "R");
    tablero[7][4] = new Rey("e8", 0, "r");

    tablero[0][3] = new Dama("d1", 1, "D");
    tablero[7][3] = new Dama("d8", 0, "d");

  }

  // Aqui esta el metodo split
  public static String[] comandos(String cadena) {
    String cad = "";
    for (int i = 2; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      cad += c;
    }
    String arreglo[] = cad.split("-");

    return arreglo;
  }

  // Validar formato 
  // Metodo para validar la entrada
  public static boolean validarFormato(String entrada) {
    boolean check = false;
    char c1 = entrada.charAt(0);//P o p
    char c2 = entrada.charAt(1);//|
    char c3 = entrada.charAt(2);//e
    char c4 = entrada.charAt(3);//numero del 1-8
    char c5 = entrada.charAt(4);//-
    char c6 = entrada.charAt(5);//e
    char c7 = entrada.charAt(6);//numero del 1-8

    // Check each char at the entrada String
    if (entrada.length()==7&&c1=='P'||c1=='p'&&c2=='|'&&c3=='e'&&c5=='-'&&c6=='e'&&(c4=='1'||c4=='2'||c4=='3'||c4=='4'||c4=='5'||c4=='6'||c4=='7'||c4=='8')&&(c7=='1'||c7=='2'||c7=='3'||c7=='4'||c7=='5'||c7=='6'||c7=='7'||c7=='8')) {
        check = true;
    } 
    return check;
  }

  // Transformar coordenada
  public static int[] transformarPosicion(String coordenada) {
    int[] posicionPieza = new int[2];

    String posicionY = Character.toString(coordenada.charAt(0));
    int posicionX = Character.getNumericValue(coordenada.charAt(1));

    switch (posicionY) {
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

    posicionPieza[1] = posicionX - 1;

    return posicionPieza;
  }

}
