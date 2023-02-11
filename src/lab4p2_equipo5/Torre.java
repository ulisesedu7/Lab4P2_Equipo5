
package lab4p2_equipo5;

import java.util.Scanner;


public class Torre extends Pieza{

    public Torre(String coordenadaPieza, int colorPieza, String nombre) {
        super(coordenadaPieza, colorPieza, nombre);
    }

    

    
    @Override
    public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
        boolean temp= false;
        
        if (coordenadaPieza.equals(getCoordenadaPieza())){
           boolean movimiento =false;
           boolean movimiento2 = false;
           char x = coordenadaPieza.charAt(0);
           char y = coordenadaPieza.charAt(1);
           char x1 = coordenadaMov.charAt(0);
           char y1 = coordenadaMov.charAt(1);
           int x2=0;
           int xx= 0;
           switch(x1){
               case 'a':x2 = 0;
                        xx = 0;
                    break;
                    case 'b':x2 = 1;
                             xx = 1;
                    break;
                    case 'c':x2 = 2;
                            xx = 2;
                    break;
                    case 'd':x2 = 3;
                            xx = 3;
                    break;
                    case 'e':x2 = 4;
                            xx = 4;
                    break;
                    case 'f':x2 = 5;
                            xx= 5;
                    break;
                    case 'g':x2 = 6;
                            xx = 6;
                    break;
                    case 'h':x2 = 7;
                            xx= 7;
                    break;
                    
           }
            for (int i = y - 1; i < y1 - 1; i++) {
                if (tablero[x2][i].equals(" ")) {
                    movimiento = true;
                } else {
                    movimiento2 = false;
                    break;
                }
            }
            for (int i = y-1; i > y1-1; i--) {
                if (tablero[x2][i].equals(" ")) {
                    movimiento = true;
                } else {
                    movimiento2 = false;
                    break;
                }
            }
            for (int j = xx; j <= x2; j++) {
                if (tablero[j][y1 - 1].equals(" ")) {
                    movimiento2 = true;
                } else {
                    movimiento2 = false;
                }
            }
           //fors para validar que no exista una pieza enfrente del movimiento
           if(x == x1){
               if(y != y1){
                   if(y1 > 0 && y1 < 9){
                       movimiento = true;
                   }
               }
           }else if(y == y1){
               if (x != x1){
                   if(x1 > 96 && x1 < 105){
                       movimiento = true;
                       
                   }
               }
           }
           //el movimiento de la torre es valido
            if(movimiento == true && movimiento2 == true){
               if( ((String)tablero[x2][y1-1]).length() > 0 ){
                   if(colorPieza != ((Pieza)tablero[x2][y1-1]).getColorPieza() ){
                       temp = true;
                   }
                   
               }else if( ((String)tablero[x2][y1-1]).equals(" ")){
                   temp = true;
               }
           }
            
        }  
    return temp;
    }
    public void Menu(){
        int op= 0;
        Scanner leer = new Scanner (System.in);
        do{
            System.out.println("-----CHESS------");
            System.out.println("1- Jugar");
            System.out.println("2- Salir");
            System.out.println("Ingrese una opcion: ");
            int resp = leer.nextInt();
            
            if (op == 1){
                System.out.println("Nombre del primer jugador: [piezas blancas]");
                String jugador1 = leer.next();
                System.out.println("Nombre del segundo jugador: [piezas negras]");
                String jugador2 = leer.next();
            }
        }while(op != 2);
    }
}
