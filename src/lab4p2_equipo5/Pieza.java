package lab4p2_equipo5;

public abstract class Pieza {
  // atributo para determinar donde esta la pieza
  protected String coordenadaPieza;
  
  // Atributo para la coordenada de movimiento
  protected String coordenadaMov;
  
  // Atributo para determinar si la pieza es blanca o negra
  protected int colorPieza; // si es 1 -> Blanca, si es 0 -> negra

  public Pieza() {
  }

  public Pieza(String coordenadaPieza, String coordenadaMov, int colorPieza) {
    this.coordenadaPieza = coordenadaPieza;
    this.coordenadaMov = coordenadaMov;
    this.colorPieza = colorPieza;
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

  @Override
  public String toString() {
    return "Pieza{" + "coordenadaPieza=" + coordenadaPieza + ", coordenadaMov=" + coordenadaMov + ", colorPieza=" + colorPieza + '}';
  }
  
  public abstract boolean movimiento(String coordenadaPieza, String coordenadaMov, Object tablero);
}
