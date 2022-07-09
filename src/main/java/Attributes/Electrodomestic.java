package Attributes;


import Enums.Color;
import Enums.Consume;

public class Electrodomestic {

  /*
  precio, color, consumo energético (letras entre A y F) y peso
   */
  protected Double price;
  protected Color color;
  protected Consume consume;
  protected Double weight;

  public Electrodomestic() {
  }

  public Electrodomestic(Double price, Color color, Consume consume, Double weight) {
    this.price = price;
    this.color = color;
    this.consume = consume;
    this.weight = weight;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Consume getConsume() {
    return consume;
  }

  public void setConsume(Consume consume) {
    this.consume = consume;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Electrodomestic characteristics:" + "\n" +
        "- Price: " + price + "\n" +
        "- Color: " + color + "\n" +
        "- Consume: " + consume + "\n" +
        "- Weight: " + weight + ".-";
  }

  //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
  //es correcta, sino es correcta usara la letra F por defecto. Este método se debe
  //invocar al crear el objeto y no será visible.
  private Consume energeticConsumeValidation(Character letterC) {

    switch (letterC) {
      case 'A':
        this.consume = Consume.A;
      case 'B':
        this.consume = Consume.B;
      case 'C':
        this.consume = Consume.C;
      case 'D':
        this.consume = Consume.D;
      case 'F':
        this.consume = Consume.F;
      default:
        System.out.println("Consumo no categorizado, se asignará 'F'");
        this.consume = Consume.F;
    }
    return this.consume;
  }

/*Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible*/

  private colorValidation()

}
