
package lab4p2_equipo5;


public class Torre extends Pieza{

    public Torre(String coordenadaPieza, int colorPieza, String nombre) {
        super(coordenadaPieza, colorPieza, nombre);
    }

    

    
    @Override
    public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
        boolean temp= false;
        
        if( colorPieza == 1){
            //Blanca
            
        }else{
            //negra
        }
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
            for (int i = y; i < y1; i++) {
                if(tablero[x2][i].equals(" ")){
                    movimiento = true;
                }else{
                    movimiento2 = false;
                    break;
                }
                for (int j = x; j <= x2; j++) {
                    
                }
            //fors para validar que no exista una pieza enfrente del movimiento
            }
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
                       
                   }
                   
               }else if( ((String)tablero[x2][y1-1]).equals(" ")){
                   
               }
           }
            
        }  
    return temp;
    }
    
}
