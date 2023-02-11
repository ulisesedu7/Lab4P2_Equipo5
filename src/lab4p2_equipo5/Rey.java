
package lab4p2_equipo5;


public class Rey extends Pieza{

    public Rey(String coordenadaPieza, int colorPieza, String nombre) {
        super(coordenadaPieza, colorPieza, nombre);
    }

    
    @Override
    public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
        boolean temp = false;
        if(coordenadaPieza.equals(getCoordenadaPieza())){
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
           if( (y1-1 == y && x2 == xx)||(y1+1 == y && x2 == xx)||(xx+1 == x2&& y == y1)||(xx-1 == x2&&y == y1)||(xx+1 == x2&& y ==y1-1)||(xx+1==x2&&y-1==y1)||(xx == x2+1&&y==y-1)||(xx == x2+1&&y==y+1)  ){
            if(colorPieza != ((Pieza)tablero[x2][y1-1]).getColorPieza() ){
                       temp = true;
                   }
                   
               }else if( ((String)tablero[x2][y1-1]).equals(" ")){
                   temp = true;
               }
        }
        return temp;
    }
    
}
