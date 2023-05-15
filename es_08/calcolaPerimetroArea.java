import java.util.Scanner; //libreria che serve per poter utilizzare i metodi di Scanner (lettura input)

public class calcolaPerimetroArea // deve chiamarsi con il nome del file .java
{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // creo un oggetto Scanner chiamato input
    System.out.print("Inserisci il tuo nome: ");
    String nome = input.nextLine();
    System.out.print("Inserisci la lughezza del lato: ");
    int lato;
    lato = input.nextInt();
    int area;
    int perimetro;
    area = lato * lato;
    perimetro = lato * 4;
    if (lato > 40 || lato < 1) 
    {
      if (lato > 40) 
      {
        System.out.println(nome +", Hai inserito un numero grande");
      }

      if (lato < 1) 
      {
        System.out.print(nome + ", Hai inserito u numero piccolo");
      } 
    }
    else 
      {
        System.out.println(nome + ", Il lato inserito e': " + lato); // concateno testo e variabili
        System.out.println("L'area e': " + area);
        System.out.println("Il perimetro e': " + perimetro);
      }
      // lascio fuori dall'if else la chusura della classe input
    

    input.close();
  }
}
