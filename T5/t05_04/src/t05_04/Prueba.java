/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t05_04;

import java.util.Arrays;

/**
 *
 * @author Adrián Penas Rouco
 */
public class Prueba {

  //Atributos
  private int[] lista;
  private String nombre;
  private int factor;

  //Set/Get
  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the factor
   */
  public int getFactor() {
    return factor;
  }

  //Métodos
  void rellenarLista() {
    for (int i = 0; i < lista.length; i++) {
      int aleatorio = (int) (Math.random() * factor + 1);
      lista[i] = aleatorio;
    }

  }

  void vaciarLista() {
    for (int i = 0; i < lista.length; i++) {
      int aleatorio = 0;
      lista[i] = aleatorio;
    }
  }

  //Se cambia void por int para definir que devuelve un entero, ya que con el void no se devuelve nada
  int devolverValorMasAlto() {
    Arrays.sort(lista);
    int maxNum = lista[lista.length - 1];
    return maxNum;
  }

  int devolverValorMasBajo() {
    Arrays.sort(lista);
    int minNum = lista[0];
    return minNum;
  }

  void imprimirLista() {
    System.out.println(Arrays.toString(lista));

  }

  int contiene(int contiene) {
    int posicion = -1;
    for (int array = 0; array < lista.length; array++) {
      if (lista[array] == contiene) {
        posicion = array;
      }
    }
    return posicion;
  }

  int contiene2(int contiene2) {
    int posicion2 = -1;
    for (int array = lista.length - 1; array >= 0; array--) {
      if (lista[array] == contiene2) {
        posicion2 = array;
      }
    }
    return posicion2;
  }

  int[] devolverValoresMayoryMenor() {
    Arrays.sort(lista);
    int maxNum = lista[lista.length - 1];
    int minNum = lista[0];
    int[] valores = {maxNum, minNum};
    return valores;
  }

//Constructores
  public Prueba(int[] lista, String nombre, int factor) {
    this.lista = lista;
    this.nombre = nombre;
    this.factor = factor;
  }

//ToString
  @Override
  public String toString() {
    return "factor=" + factor;
  }

}
