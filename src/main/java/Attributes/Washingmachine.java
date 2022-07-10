package Attributes;

import Enums.Color;
import Enums.Consume;

public class Washingmachine extends Electrodomestic {

  protected Integer capacity;

  public Washingmachine() {
  }

  public Washingmachine(Double price, Color color, Consume consume, Double weight,
      Integer capacity) {
    super(price, color, consume, weight);
    this.capacity = capacity;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  //CREAREMOS LA LAVADORA, HEREDANDO LOS ATRIBUTOS DE LA SUPERCLASE
  @Override
  public void createElectrodomestic() {
    super.createElectrodomestic();

    System.out.println("Paso 03 - Por favor indique la capacidad de carga en [kg]");
    this.capacity = read.nextInt();

  }

  //DETERMINACIÓN DEL PRECIO FINAL
  /*
  Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio.
   */
  @Override
  public Double finalPrice() {

    super.finalPrice();
    if (this.capacity > 30) {
      super.setPrice(super.getPrice() + 500);
    }
    return this.price;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "- Capacity: " + capacity + " --<";
  }

}
