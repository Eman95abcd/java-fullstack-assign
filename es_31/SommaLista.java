import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommaLista {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   // metodo di input

    List<Integer> lista = new ArrayList<Integer>();   //creo una lista di numeri interi
    System.out.println("Inserisci gli elementi della lista (inserisci 0 per terminare l'inserimento):");
    int elemento = input.nextInt();  // creo una variabile che riceve gli input digitati dall'utente
    while (elemento != 0) 
    {     
      lista.add(elemento);       //aggiunge alla lista ogni elemento digitato dall'utente diverso da zero ()
      elemento = input.nextInt();
    }
    int somma = 0;
    for (Integer numero : lista) // per ogni numero della lista
    {     
      somma += numero;       // somma ogni valore della lista 
    }
    System.out.println("La somma degli elementi della lista è " + somma + ".");

    input.close();
  }
}