import java.util.Random;
import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numeroCasuale = rand.nextInt(100) + 1;
        Giocatore giocatore = new Giocatore(); // aggiunta creazione giocatore
        Gioco gioco = new Gioco(numeroCasuale, giocatore); // aggiunta creazione gioco

        gioco.gioca();
        input.close();
    }
}

class Giocatore 
{
    private String nome;
    private int tentativi;

    public Giocatore() 
    {
        this.nome = "";
        this.tentativi = 0; // valore di default
    }

    public String getNome() 
    {
        return nome;
    }

    public int getTentativi() 
    {
        return tentativi;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setTentativi(int tentativi) 
    {
        this.tentativi = tentativi;
    }

}

class Gioco 
{
    private int numeroCasuale;
    private Giocatore giocatore;

    public Gioco(int numeroCasuale, Giocatore giocatore) 
    {
        this.numeroCasuale = numeroCasuale;
        this.giocatore = giocatore;
    }

    public void gioca()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Indovina il numero tra 1 e 100!");
        System.out.println("Inserisci il tuo nome: ");

        String nome = input.nextLine();
        giocatore.setNome(nome);

        boolean indovinato = false;

        while(!indovinato && giocatore.getTentativi() + 1);

        if (tentativo == numeroCasuale)
        {
            System.out.println("Complimenti, " + giocatore.getNome() + "! Hai indovinato il numero in " +giocatore.tentativi() + " tentativi") ;
            indovinato = true;
        }
        else if (tentativo < numeroCasuale)
        {
            System.out.println("Il numero è più grande del tuo tentativo.");
        } else
        {
            System.out.println("Il numero è piu piccolo del tuo tentativo.");
        }
    }

    if(indovinato)

    {
        System.out.println("Mi dispiace, " + giocatore.getNome() + ". Hai esaurito i tentativi. il numero casuale era "
                + numeroCasuale);
    }

    input.close();
}