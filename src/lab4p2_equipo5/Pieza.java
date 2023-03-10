package lab4p2_equipo5;

public abstract class Pieza {
  // Nombre de la pieza 
  public String nombre;
  
  // atributo para determinar donde esta la pieza
  protected String coordenadaPieza;
  
  // Atributo para la coordenada de movimiento
  protected String coordenadaMov;
  
  // Atributo para determinar si la pieza es blanca o negra
  protected int colorPieza; // si es 1 -> Blanca, si es 0 -> negra
  
  // Atributo para saber si comio piezas
  public boolean comio;
  public String piezaComida;

  public Pieza() {
  }

  public Pieza(String coordenadaPieza, int colorPieza, String nombre) {
    this.coordenadaPieza = coordenadaPieza;
    this.colorPieza = colorPieza;
    this.nombre = nombre;
  }

  public String getCoordenadaPieza() {
    return coordenadaPieza;
  }

  public void setCoordenadaPieza(String coordenadaPieza) {
    this.coordenadaPieza = coordenadaPieza;
  }

  public String getCoordenadaMov() {
    return coordenadaMov;
  }

  public void setCoordenadaMov(String coordenadaMov) {
    this.coordenadaMov = coordenadaMov;
  }

  public int getColorPieza() {
    return colorPieza;
  }

  public void setColorPieza(int colorPieza) {
    this.colorPieza = colorPieza;
  }

  public boolean isComio() {
    return comio;
  }

  public void setComio(boolean comio) {
    this.comio = comio;
  }

  public String getPiezaComida() {
    return piezaComida;
  }

  public void setPiezaComida(String piezaComida) {
    this.piezaComida = piezaComida;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Pieza{" + "coordenadaPieza=" + coordenadaPieza + ", coordenadaMov=" + coordenadaMov + ", colorPieza=" + colorPieza + '}';
  }
  
  public abstract boolean movimiento(String coordenadaPieza, String coordenadaMov, Object[][] tablero);
}
