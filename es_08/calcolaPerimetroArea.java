import java.util.Scanner; //libreria che serve per poter utilizzare i metodi di Scanner (lettura input)

public class calcolaPerimetroArea // deve chiamarsi con il nome del file .java
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in); //creo un oggetto Scanner chiamato input
      System.out.print("Inserisci la lughezza del lato: ");
      int lato; //questo sarà il parametro che utilizzerò per i calcoli
      lato = input.nextInt(); 
      int area;
      int perimetro;
      lato = 5; //assegno il valore 5 alla variabile lato
      area = lato * lato;
      perimetro = lato * 4;
      System.out.println(lato); //stampa della variabile lato
      System.out.println(area);
      System.out.println(perimetro);
      input.close(); // la chiusura è opzionale ma segna in giallo l'input finchè non lo mettiamo
    }
    
}
