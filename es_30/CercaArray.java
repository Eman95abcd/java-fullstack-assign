import java.util.Scanner;

public class CercaArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);    // metodo di input

        System.out.print("Inserisci la dimesnione dell'array: ");
        int dimensione = input.nextInt();     // creo una variabile dimensione che conterrà la dimensione dell'array digitata dall'utente
        int[] array = new int[dimensione];    // creo un array di tipo int che avrà come dimensione il valore digitato dall'utente
        System.out.println("Inserisci gli elementi dell'array: ");
        for (int i = 0; i < dimensione; i++)    
        {
            array[i] = input.nextInt();      // assegno a ogni indice dell'array i corrispettivi valori digitati dall'utente
        }
        System.out.print("Inserisci il numero da cercare: ");
        int numeroCercato = input.nextInt();    // creo una variabile di tipo int che avrà come valore il numero da cercare
        int indice = -1;                         //creo una variabile a cui do il valore -1 che rappresenta l'indice di un elemento che  non esiste
        for (int i = 0; i < dimensione; i++)
        {
            if (array[i] == numeroCercato)  // se ad un determinato indice trovo il numero cercato 
            {
                indice = i;
                break;       // esci dal programma
            }
        }
        if (indice != -1)
        {
            System.out.println("Il numero si trova all'indice " + indice + " dell'array");
        } 
        else 
        {
            System.out.println("Il numero non è presente nell'array.");
        }
      
          input.close();
    }
    
}
