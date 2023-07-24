import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Gioco gioco = new Gioco();
        gioco.gioca();
        
    }
}

    class Giocatore
    {

        private String nome = "";
        private int punteggio = 0;

        public String getNome()
        {
            return nome;
        }

        public void setNome(String nuovoNome)
        {
            this.nome = nuovoNome;
        }

        public int getPunteggio()
        {
            return punteggio;
        }

        public void setPunteggio(int nuovoPunteggio)
        {
            this.punteggio += nuovoPunteggio;
        }
    }
    
    class Gioco
    {
       /*  private Giocatore giocatore;
        private Giocatore computer;

        public Gioco(Giocatore giocatore)
        {
            this.giocatore = giocatore;
        }    */

        public void gioca()
        {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            System.out.print("Inserisci il tuo nome: ");
            String nome = input.nextLine();

            Giocatore gioc = new Giocatore();
            Giocatore comp = new Giocatore();

            gioc.setNome(nome);
            
            int contatore = 0;
            // int puntGioc = 0;
            // int puntComp = 0;
            Map<Integer, String> tabellaConversione = new LinkedHashMap<Integer, String>();
            tabellaConversione.put(1, "Carta");
            tabellaConversione.put(2, "Sasso");
            tabellaConversione.put(3, "Forbici");
    
            System.out.println("Ciao " + gioc.getNome()
                    + ", Si giocano 5 manches che valgono 2 punti l'una. Una vittoria vale 2 punti, un pareggio vale 1 punto e chi perde ottiene 0 punti. Vince chi ha piu' punti alla fine delle 5 giocate.");
                    String giocataCompString = " ";
    
            while (contatore < 5)
            {
                System.out.println(gioc.getNome() + ", scegli una di queste 3 opzioni: Carta(1), Sasso(2), Forbici(3)");
                int giocata = input.nextInt();
    
                if (giocata == 1)
                {
                    System.out.println("Hai scelto Carta");
                }
                else if (giocata == 2)
                {
                    System.out.println("Hai scelto Sasso");
                }
                else if (giocata == 3)
                {
                    System.out.println("Hai scelto Forbici");
                }
    
                int giocataComp = rand.nextInt(3) + 1;
                
                if (giocataComp == 1)
                {
                    giocataCompString = "Carta";
                }
                else if (giocataComp == 2)
                {
                    giocataCompString = "Sasso";
                }
                else if (giocataComp == 3)
                {
                    giocataCompString = "Forbici";
                }
                
                
                System.out.println("La giocata del Computer e': " + giocataCompString);
    
                // Definisci gli indici per le scelte (carta, sasso, forbice)
                final int CARTA = 1;
                final int SASSO = 2;
                final int FORBICE = 3;

                // Array per le opzioni disponibili
                String[] opzioni = { "", "carta", "sasso", "forbice" };

                // Determina il vincitore
                if (giocata == giocataComp)
                {
                    System.out.println("Pareggio");
                    gioc.setPunteggio(1);
                    comp.setPunteggio(1);
                }
                else if ((giocata == CARTA && giocataComp == SASSO) ||
                        (giocata == SASSO && giocataComp == FORBICE) ||
                        (giocata == FORBICE && giocataComp == CARTA))
                {
                    System.out.println(nome + " vince.");
                    gioc.setPunteggio(2);
                }
                else
                {
                    System.out.println("Computer vince.");
                    comp.setPunteggio(2);
                }
                contatore++;
                

            }
            System.out.println("Il punteggio finale e':\n" + "Computer: " + comp.getPunteggio() + "\n" + nome + ": " + gioc.getPunteggio() );
            input.close();
        }
        
    }

