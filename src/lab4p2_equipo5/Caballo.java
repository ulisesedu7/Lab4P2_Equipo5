
package lab4p2_equipo5;
public class Caballo extends Pieza{

    public Caballo() {
        super();
    }
    

    public Caballo(String coordenadaPieza, int colorPieza, String nombre) {
        super(coordenadaPieza, colorPieza, nombre);
    }
    
    

    @Override
    public boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero) {
        boolean movimiento,validacion;
        int col = 0;
        int col2 = 0;
        int fil = 0;
        int fil2 = 0;
        
        //Convierte las letras en numeros segun Ascii para mayor facilidad de movimiento 
        for (int i = 0; i < coordenadaPieza.length(); i++) {
            char c = coordenadaPieza.charAt(i);
            if (i==0) {
                
                col = (int)c; 
            }
            if (i==1) {
                
                fil = ((int)c)-48;
            }
        }
        for (int i = 0; i < coordenadaMov.length(); i++) {
            char c = coordenadaMov.charAt(i);
            if (i==0) {
                
                col2 = (int)c; 
            }
            if (i==1) {
                
                fil2 = ((int)c)-48;
            }
        }
        
        movimiento = mover(fil, col, fil2, col2);
        comio = comerpieza(movimiento, tablero, colorPieza, fil2-1, col2-1);
        validacion = comerpieza(movimiento, tablero, colorPieza, fil2-1, col2-1);
        //Validacion pisicion en misma pieza
        if (coordenadaPieza.equals(coordenadaMov)) {
            validacion = false;
            System.out.println("La pieza ya esta en esa posicion");//!!!!!
        }
        
        
        return validacion; 
    }
    public boolean comerpieza(boolean val,Object[][] tablero,int colorpieza, int fil2, int col2){
        boolean come = false;
        if (val ==true) {
            if (tablero[fil2][col2]!=" ") {
                come = true;
                if (colorpieza ==1) {
                    //piezaComida = " ";
                    if (tablero[fil2][col2]=="p") {
                        piezaComida = "p";
                    }
                    if (tablero[fil2][col2]=="n") {
                        piezaComida = "n";
                    }
                    if (tablero[fil2][col2]=="b") {
                        piezaComida = "b";
                    }
                    if (tablero[fil2][col2]=="r") {
                        piezaComida = "r";
                    }
                    if (tablero[fil2][col2]=="q") {
                        piezaComida = "q";
                    }
                    if (tablero[fil2][col2]=="k") {
                        piezaComida = "k";
                    }
                }else if (colorpieza ==0) {
                    //piezaComida = " ";
                    if (tablero[fil2][col2]=="P") {
                        piezaComida = "P";
                    }
                    if (tablero[fil2][col2]=="N") {
                        piezaComida = "N";
                    }
                    if (tablero[fil2][col2]=="B") {
                        piezaComida = "B";
                    }
                    if (tablero[fil2][col2]=="R") {
                        piezaComida = "R";
                    }
                    if (tablero[fil2][col2]=="Q") {
                        piezaComida = "Q";
                    }
                    if (tablero[fil2][col2]=="K") {
                        piezaComida = "K";
                    }
                } else {
                    come = false;
                }
                
            }
        }
        return come;
        
    }
    public boolean mover(int fil, int col, int fil2, int col2){
        boolean val = false; 
        if(col2==col+1&&fil2==fil-3){
            val = true;
        }
        if(col2==col-3&&fil2==fil+1){
            val = true;
        }
        if(col2==col+3&&fil2==fil-1){
            val = true;
        }
        if(col2==col-1&&fil2==fil+3){
            val = true;
        } 
        return val;
    }
    
    
    
    
    
    
}
