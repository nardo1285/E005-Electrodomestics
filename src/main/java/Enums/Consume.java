package Enums;

public enum Consume {

  //Consumo energético (letras entre A y F)

  A("A"), B("B"), C("C"), D("D"), E("E"), F("F");

  private String valorConsume;

  //CONSTRUCTORES
  private Consume() {
  }

  Consume(String valorConsume) {
    this.valorConsume = valorConsume;
  }

  //GETTERS Y SETTERS
  public String getValorConsume() {
    return valorConsume;
  }
  
  public void setValorConsume(String valorConsume) {
    this.valorConsume = valorConsume;
  }
}
