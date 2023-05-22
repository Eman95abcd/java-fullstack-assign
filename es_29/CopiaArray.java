import java.util.Arrays;
import java.util.Scanner;

public class CopiaArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // creo un oggetto input di classe Scanner per ricevere input dall'utente

    System.out.print("Inserisci la dimensione dell'array: ");
    int dimensione = input.nextInt();       // creo una variabile dimensione per contenere la dimensione dell'array
    int[] array = new int[dimensione];      // creo un array di tipo int che avrà come dimensione il valore digitato dall'utente
    System.out.println("Inserisci gli elementi dell'array:");
    for (int i = 0; i < dimensione; i++) {   
      array[i] = input.nextInt();      // assegno a ogni indice dell'array ognuno degli elementi digitati dall'utente
    }
    int[] arrayCopia = new int[dimensione];  // creo una copia dell'array che ha come dimensione la medesima dimensione dell'array precedente
    for (int i = 0; i < dimensione; i++) {
      arrayCopia[i] = array[i];       // assegno a ogni indice di arrayCopia lo stesso valore dell'array precedente
    }
    System.out.println("L'array originale è: " + Arrays.toString(array));
    System.out.println("L'array copiato è: " + Arrays.toString(arrayCopia));

    input.close();    // chiudo lo scanner
  }
}