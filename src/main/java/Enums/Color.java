package Enums;

public enum Color {

  //Los colores disponibles para los
  //electrodomésticos son blanco, negro, rojo, azul y gris

  BLANCO("Blanco"),
  NEGRO("Negro"),
  ROJO("Rojo"),
  AZUL("Azul"),
  GRIS("Gris");


  //Atributo
  private String valorColor;

  //CONSTRUCTORES
  private Color() {

  }

  private Color(String valorColor) {
    this.valorColor = valorColor;
  }

  //GETTERS Y SETTERS
  public String getValorColor() {
    return valorColor;
  }

  public void setValorColor(String valorColor) {
    this.valorColor = valorColor;
  }


}
