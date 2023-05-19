import java.util.Scanner;
import java.util.Random;

public class VersioneInsegnante {
    public static void main(String[] args)
    {   
        Random rand = new Random();
        int numeroDaIndovinare = rand.nextInt(100) +1;
        
         int numeroDitentativi = 0;
        Scanner input = new Scanner(System.in);
        int tentativo;
        boolean vincita = false;

        while (vincita == false)
        {
            System.out.print("Inodvina un numero tra 1 e 100: ");
            tentativo = input.nextInt();
            numeroDitentativi ++;

            if (tentativo == numeroDaIndovinare) 
            {
                vincita = true;
            } else if (tentativo < numeroDaIndovinare) 
            {
                System.out.println("Troppo basso! Prova ancora!");
            } else if (tentativo > numeroDaIndovinare) 
            {
                System.out.println("Troppo alto! Prova ancora!");
            }
        }
        System.out.println("Bravo! Hai indovinato il numero");
        // System.out.print("Bravo! Hai indovinato il numero dopo " + tentativi + " tentativi");
        input.close();
    }
}
