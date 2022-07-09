package Attributes;


import Enums.Color;
import Enums.Consume;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdk.swing.interop.SwingInterOpUtils;

public class Electrodomestic {

  /*
  precio, color, consumo energético (letras entre A y F) y peso
   */
  protected Double price;
  protected Color color;
  protected Consume consume;
  protected Double weight;

  Scanner read = new Scanner(System.in).useDelimiter("\n");
  List<Electrodomestic> electrodomesticList = new ArrayList<>();

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
        break;
      case 'B':
        this.consume = Consume.B;
        break;
      case 'C':
        this.consume = Consume.C;
        break;
      case 'D':
        this.consume = Consume.D;
        break;
      case 'F':
        this.consume = Consume.F;
        break;
      default:
        System.out.println("Consumo no categorizado, se asignará 'F'");
        this.consume = Consume.F;
        break;
    }
    return this.consume;
  }

/*Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible*/

  private Color colorValidation(String colorSelected) {

    switch (colorSelected.toUpperCase()) {
      case "BLANCO":
        this.color = Color.BLANCO;
        break;
      case "NEGRO":
        this.color = Color.NEGRO;
        break;
      case "ROJO":
        this.color = Color.ROJO;
        break;
      case "AZUL":
        this.color = Color.AZUL;
        break;
      case "GRIS":
        this.color = Color.GRIS;
        break;
      default:
        System.out.println("El color no es el correcto, por lo que se le asignará Blanco");
        this.color = Color.BLANCO;
        break;
    }
    return this.color;
  }

  /*
  Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
   */
  public void createElectrodomestic() {
    System.out.println("---Sistema de carga de Electrodomésticos");

    //INGRESO LA CATEGORÍA DE CONSUMO Y LA VALIDO
    System.out.println(
        "Paso 1 - Por favor indique el consumo, eligiendo según la letra desde la 'A' a la 'F'");
    energeticConsumeValidation(read.next().toUpperCase().charAt(0));

    //INGRESO EL COLOR Y LO VALIDO
    System.out.println("Paso 2 - Por favor indique el Color" + "\n" +
        "Seleccione entre Negro, Blanco, Azul, Rojo o Gris");
    colorValidation(read.next().toUpperCase());

    //AL PRECIO, SE LE ASIGNA UN VALOR BASE
    this.price = 1000.0;

    //INGRESO DEL PESO EN KG
    System.out.println("Ingrese el peso del electrodoméstico en [kg]: ");
    this.weight = read.nextDouble();
    
  }

}
