package lab4p2_equipo5;

import java.util.Arrays;

public class Lab4P2_Equipo5 {
    public static Object[][] tablero = new Object[8][8];
  

  public static void main(String[] args) {
    crearTablero();
      System.out.println(imprimir(tablero)+"Tablero: \n");
  }
  
  static String imprimir(Object [][]matriz){
      String cadena = "";
      for (Object[] t : matriz) {
          cadena += "["+Arrays.toString(t)+"]\n";
      }
      
        return cadena; 
    }
  
  public static void crearTablero() {
    tablero[1][0] = new Peon("a2", 1, "Peon");
    tablero[1][1] = new Peon("b2", 1, "Peon");
    tablero[1][2] = new Peon("c2", 1, "Peon");
    tablero[1][3] = new Peon("d2", 1, "Peon");
    tablero[1][4] = new Peon("e2", 1, "Peon");
    tablero[1][5] = new Peon("f2", 1, "Peon");
    tablero[1][6] = new Peon("g2", 1, "Peon");
    tablero[1][7] = new Peon("h2", 1, "Peon");
    
    tablero[7][0] = new Peon("a7", 0, "Peon");
    tablero[7][1] = new Peon("b7", 0, "Peon");
    tablero[7][2] = new Peon("c7", 0, "Peon");
    tablero[7][3] = new Peon("d7", 0, "Peon");
    tablero[7][4] = new Peon("e7", 0, "Peon");
    tablero[7][5] = new Peon("f7", 0, "Peon");
    tablero[7][6] = new Peon("g7", 0, "Peon");
    tablero[7][7] = new Peon("h7", 0, "Peon");
    
    tablero[0][0] = new Torre("a1", 1, "Torre");
    tablero[0][7] = new Torre("h1", 1, "Torre");
    
    tablero[7][0] = new Torre("a8", 0, "Torre"); 
    tablero[7][7] = new Torre("h8", 0, "Torre");
    
    tablero[0][1] = new Caballo("b1", 1, "Caballo");
    tablero[0][6] = new Caballo("g1", 1, "Caballo");
    
    tablero[7][1] = new Caballo("b8", 0, "Caballo");
    tablero[7][6] = new Caballo("g8", 0, "Caballo");
    
    tablero[0][2] = new Alfil("c1", 1, "Alfil");
    tablero[0][5] = new Alfil("f1", 1, "Alfil");
    tablero[7][2] = new Alfil("c8", 0, "Alfil");
    tablero[7][5] = new Alfil("f8", 0, "Alfil");
    
    tablero[0][4] = new Rey("e1", 1, "Rey");
    tablero[7][4] = new Rey("e8", 0, "Rey");
    
    tablero[0][3] = new Dama("d1", 1, "Dama");
    tablero[7][3] = new Dama("d8", 0, "Dama");
    
    
  }

}
