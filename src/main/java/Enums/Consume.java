package Enums;

public enum Consume {

  //Consumo energético (letras entre A y F)

  A('A'), B('B'), C('C'), D('D'), E('E'), F('F');

  private Character valorConsume;

  //CONSTRUCTORES
  private Consume() {
  }

  Consume(Character valorConsume) {
    this.valorConsume = valorConsume;
  }

  //GETTERS Y SETTERS
  public Character getValorConsume() {
    return valorConsume;
  }
  
  public void setValorConsume(Character valorConsume) {
    this.valorConsume = valorConsume;
  }
}
