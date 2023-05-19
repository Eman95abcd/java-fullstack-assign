import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IndovinaNumero 
{
    public static void main(String[] args)
    {
        List<Integer> lista_numeri = new ArrayList<Integer>();
        

        for (int i = 0; i <= 100; i++)
        {
            lista_numeri.add(i);
        }
        // System.out.print(lista_numeri);

        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean vincita = false;
        int numDaIndovinare = rand.nextInt(100);

        
        while (vincita == false)
        {
            System.out.print("\nInserisci un numero: ");
            
            int numInserito = input.nextInt();

            if (numInserito == numDaIndovinare)
            {
                vincita = true;
            }
            else if (numInserito > numDaIndovinare)
            {
                System.out.print("Numero troppo grande. Riprova.");
            }
            else if (numInserito < numDaIndovinare)
            {
                System.out.print("numero troppo piccolo. Riprova");
            }
            
        }
    

              System.out.print("Hai indovinato!");
    
       
        

    }

    
}
