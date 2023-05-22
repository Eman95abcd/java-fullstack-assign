import java.util.Scanner;
import java.util.Random;

public class Carta_Sasso_Forbici
{
        public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        int contatore = 0;
        int puntGioc = 0;
        int puntComp = 0;
        String giocata = "";
        String sceltaComputer ="";

        System.out.println("Ciao " + nome
                + ", Si giocano 5 manches che valgono 2 punti l'una. Una vittoria vale 2 punti, un pareggio vale 1 punto e chi perde ottiene 0 punti. Vince chi ha piu' punti alla fine delle 5 giocate.");

        while (contatore < 5)
        {
            System.out.println(nome + ", scegli una di queste 3 opzioni: Carta, Sasso, Forbici");
            giocata = input.next();

            String[] opzioni = { "Carta", "Sasso", "Forbici" };
            int i = rand.nextInt(3);
            sceltaComputer = opzioni[i];
            System.out.println("La giocata del Computer e': " + sceltaComputer);

            if (giocata.equalsIgnoreCase(sceltaComputer))
            {
                System.out.println("Pareggio");
                puntGioc += 1;
                puntComp += 1;
                contatore++;
            }
            else if (giocata.equalsIgnoreCase("carta")  && sceltaComputer.equalsIgnoreCase("Sasso")) 
            {
                System.out.println(nome + " vince.");
                puntGioc += 2;
                contatore++;
            } 
            else if (giocata.equalsIgnoreCase("Carta") && sceltaComputer.equalsIgnoreCase("Forbici")) 
            {
                System.out.println("Computer vince.");
                puntComp += 2;
                contatore++;
            } 
            else if (giocata.equalsIgnoreCase("Sasso") && sceltaComputer.equalsIgnoreCase("Carta")) 
            {
                System.out.println("Computer vince.");
                puntComp += 2;
                contatore++;
            } 
            else if (giocata.equalsIgnoreCase("Sasso") && sceltaComputer.equalsIgnoreCase("Forbici")) 
            {
                System.out.println(nome + " vince.");
                puntGioc += 2;
                contatore++;
            } 
            else if (giocata.equalsIgnoreCase("Forbici") && sceltaComputer.equalsIgnoreCase("Carta")) 
            {
                System.out.println(nome + " vince.");
                puntGioc += 2;
                contatore++;
            } 
            else if (giocata.equalsIgnoreCase("Forbici") && sceltaComputer.equalsIgnoreCase("Sasso"))
            {
                System.out.println("Computer vince.");
                puntComp += 2;
                contatore++;
            }
        }
        System.out.println("Il punteggio finale e':\n" + "Computer: " + puntComp + "\n" + nome + ": " + puntGioc );

    }
}