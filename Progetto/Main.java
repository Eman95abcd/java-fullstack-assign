import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
    }

    public class Giocatore {

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

        public int punteggio()
        {
            return punteggio;
        }

        public void setPunteggio(int nuovoPunteggio)
        {
            this.punteggio = nuovoPunteggio;
        }
    }
    
    public class Gioco 
    {
        private Giocatore giocatore;

        public Gioco(Giocatore giocatore) 
        {
            this.giocatore = giocatore;
        }

        public void gioca()
        {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            System.out.print("Inserisci il tuo nome: ");
            String nome = input.nextLine();

            giocatore.setNome(nome);
            
            int contatore = 0;
            int puntGioc = 0;
            int puntComp = 0;
            Map<Integer, String> tabellaConversione = new LinkedHashMap<Integer, String>();
            tabellaConversione.put(1, "Carta");
            tabellaConversione.put(2, "Sasso");
            tabellaConversione.put(3, "Forbici");
    
            System.out.println("Ciao " + giocatore.getNome()
                    + ", Si giocano 5 manches che valgono 2 punti l'una. Una vittoria vale 2 punti, un pareggio vale 1 punto e chi perde ottiene 0 punti. Vince chi ha piu' punti alla fine delle 5 giocate.");
                    String giocataCompString = " ";
    
            while (contatore < 5)
            {
                System.out.println(giocatore.getNome() + ", scegli una di queste 3 opzioni: Carta(1), Sasso(2), Forbici(3)");
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
    
                if (giocata == giocataComp)
                {
                    System.out.println("Pareggio");
                    puntGioc += 1;
                    puntComp += 1;
                    contatore++;
                }
                else if (giocata == 1  && giocataComp == 2) 
                {
                    System.out.println(nome + " vince.");
                    puntGioc += 2;
                    contatore++;
                } 
                else if (giocata == 1 && giocataComp == 3) 
                {
                    System.out.println("Computer vince.");
                    puntComp += 2;
                    contatore++;
                } 
                else if (giocata == 2 && giocataComp == 1) 
                {
                    System.out.println("Computer vince.");
                    puntComp += 2;
                    contatore++;
                } 
                else if (giocata == 2 && giocataComp == 3) 
                {
                    System.out.println(nome + " vince.");
                    puntGioc += 2;
                    contatore++;
                } 
                else if (giocata == 3 && giocataComp == 1) 
                {
                    System.out.println(nome + " vince.");
                    puntGioc += 2;
                    contatore++;
                } 
                else if (giocata == 3 && giocataComp == 2)
                {
                    System.out.println("Computer vince.");
                    puntComp += 2;
                    contatore++;
                }
            }
            System.out.println("Il punteggio finale e':\n" + "Computer: " + puntComp + "\n" + nome + ": " + puntGioc );
        }
    }
}

