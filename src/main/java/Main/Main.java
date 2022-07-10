package Main;

import Attributes.Electrodomestic;
import Attributes.Television;
import Attributes.Washingmachine;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    //
    System.out.println(">>>---Sistema de carga de Electrodomésticos----<<<");
    System.out.println("Seleccione el electrodoméstico a cargar: ");
    System.out.println("A - Lavarropas" + "\n" + "B - Televisor");
    System.out.println(">>>--------------------------------------------<<<");

    switch (read.next().toUpperCase()) {
      case "A":
        System.out.println("Se cargará un LAVARROPAS");
        Electrodomestic newWashmachine = new Washingmachine();

        newWashmachine.createElectrodomestic();

        System.out.println(
            "El precio al que deberá publicar este LAVARROPAS es: $" + newWashmachine.finalPrice());
        System.out.println("FIN DEL PROGRAMA");
        break;

      case "B":
        System.out.println("Se cargará un TELEVISOR");
        Electrodomestic newTelevisor = new Television();

        newTelevisor.createElectrodomestic();

        System.out.println(
            "El precio al que deberá publicar este TELEVISOR es: $" + newTelevisor.finalPrice());
        System.out.println("FIN DEL PROGRAMA");
        break;
    }


  }
}
