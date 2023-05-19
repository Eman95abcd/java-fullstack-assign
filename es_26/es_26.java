import java.util.Scanner;
import java.util.Random;

public class es_26 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random casuale = new Random();
        int casual = casuale.nextInt(100) + 1;
        int numeroUtente; // dichiaro la variabile utente
        do{
            System.out.print("Indovina un numero da 1 a 100: ");
            numeroUtente = input.nextInt(); // inizializzo la variabile
            if (numeroUtente < casual)
            {
                System.out.print("Il numero che hai scelto é troppo basso");
            }
            else if (numeroUtente > casual)
            {
                System.out.println("Il numero che hai scelto è troppo alto");
            }
        }
        while (numeroUtente != casual);
        System.out.print("Complimenti, hai indovinato il numero " + casual);  
    }
    
}
