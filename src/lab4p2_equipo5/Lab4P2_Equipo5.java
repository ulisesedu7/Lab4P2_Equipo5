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
      
      validarFormato(entrada);
      
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
    for (int i = 0; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      if (c != 'P' || c != 'p' || c != '|') {
        cad += c;
      }
    }
    String arreglo[] = cadena.split("-");

    return arreglo;
  }
  
  // Validar formato 
  // Metodo para validar la entrada
  public static void validarFormato(String entrada) {
    boolean check = false;
    
    // Check each char at the entrada String
    if(entrada.charAt(0) == 'a') {
      
    }    
  }

}
