/*
Clase prueba con los siguientes componentes:

atributos (todos privados)

    private int[] lista;   ->  sin ningún tipo de acceso desde fuera de la clase
    private String nombre;  -> dejamos que se consulte y/o cambie desde fuera
    private int factor;    --> permitimos su consulta desde fuera

métodos

     rellenarLista()  -> rellena la lista con valores aletorios entre  [0-factor)
     vaciarLista()   -> pone todos los valores a cero
     devolverValorMasAlto()  -> devuelve el valor más alto de la lista
     devolverValorMasBajo() -> devuleve el valor más bajo de la lista

      imprimirLista()  -> imrprime la lista (formato libre)

     contiene   -> le pasamos un valor y mira si está contenido en la lista, indicando en qué posición de la misma está la primera ocurrencia

     contiene2   -> le pasamos un valor y mira si está contenido en la lista, indicando en qué posición de la misma está la última ocurrencia

     devolverValoresMayoyYMenor  -> devuelve  los valores mayor y menor de la lista
 */
package t05_04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrián Penas Rouco
 */
public class T05_04 {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    Prueba rellenar = new Prueba(new int[7], "Lista1", 70);
    System.out.print("Presiona enter para rellenar la lista...");
    tec.nextLine();
    rellenar.rellenarLista();
    rellenar.imprimirLista();
    System.out.print("Presiona enter para imprimir el número más alto... ");
    tec.nextLine();
    System.out.println(rellenar.devolverValorMasAlto());
    System.out.print("Presiona enter par imprimir el número más bajo...");
    tec.nextLine();
    System.out.println(rellenar.devolverValorMasBajo());
    System.out.print("Presiona enter para comprobar si el número está en la lista(1ªForma)...");
    tec.nextLine();
    //Cambiar 3 por el número que se quiere comprobar
    rellenar.contiene(3);
    if (rellenar.contiene(3) == -1) {
      System.out.println("El número no está en la lista");
    } else {
      System.out.println("El número está en la posición " + rellenar.contiene(3));
    }
    System.out.print("Presiona enter para comprobar si el número está en la lista(2ªForma)...");
    tec.nextLine();
    //Cambiar 4 por el número que se quiere comprobar
    rellenar.contiene2(4);
    if (rellenar.contiene(4) == -1) {
      System.out.println("El número no está en la lista");
    } else {
      System.out.println("El número está en la posición " + rellenar.contiene2(4));
    }
    System.out.print("Presiona enter par imprimir el número más alto y el más bajo, en este orden...");
    tec.nextLine();
    System.out.println(Arrays.toString(rellenar.devolverValoresMayoryMenor()));
    System.out.print("Presiona enter para vaciar la lista...");
    tec.nextLine();
    rellenar.vaciarLista();
    rellenar.imprimirLista();

  }
}
