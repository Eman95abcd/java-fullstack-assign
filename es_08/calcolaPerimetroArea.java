import java.util.Scanner; //libreria che serve per poter utilizzare i metodi di Scanner (lettura input)

public class calcolaPerimetroArea // deve chiamarsi con il nome del file .java
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in); //creo un oggetto Scanner chiamato input
      System.out.print("Inserisci la lughezza del lato: ");
      int lato; 
      lato = input.nextInt(); 
      int area;
      int perimetro;
      area = lato * lato;
      perimetro = lato * 4;
      System.out.println("Il lato inserito: " + lato); //concateno testo e variabili
      System.out.println("L'area e': "+ area);
      System.out.println("Il perimetro e': " + perimetro);
      input.close(); 
    
}
