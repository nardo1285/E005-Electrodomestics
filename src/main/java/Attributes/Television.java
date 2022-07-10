package Attributes;

import Enums.Color;
import Enums.Consume;

public class Television extends Electrodomestic {

  protected Integer size;
  protected boolean tdt;

  public Television() {
  }

  public Television(Double price, Color color, Consume consume, Double weight,
      Integer size, boolean tdt) {
    super(price, color, consume, weight);
    this.size = size;
    this.tdt = tdt;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public boolean getTdt() {
    return tdt;
  }

  public void setTdt(boolean tdt) {
    this.tdt = tdt;
  }

  //CREAR TELEVISOR

  @Override
  public void createElectrodomestic() {
    super.createElectrodomestic();

    System.out.println("Paso 3 - Ingrese el tamaño en pulgadas del televisor: ");
    this.size = read.nextInt();
    System.out.println("Paso 4 - Ingrese 's' si tiene TDT, si no tiene coloque 'n'.");
    if (read.next().toUpperCase() == "S") {
      this.tdt = true;
    } else {
      this.tdt = false;
    }
  }

  //DETERMINAR EL PRECIO
  /* Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500.-*/
  @Override
  public Double getPrice() {
    if (this.size > 40) {
      super.setPrice(super.getPrice() * 1.3);
    }
    if (this.tdt == true) {
      super.setPrice(super.getPrice() + 500);
    }

    return this.price;
  }
  
}
