import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IndovinaNumero {
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

   
         System.out.print("\nInserisci un numero: ");
            int numDaIndovinare = rand.nextInt(100);
            int numInserito = input.nextInt();
       
        
        if (numInserito != numDaIndovinare)
        {
           
            if (numInserito > numDaIndovinare)
            {
                System.out.print("Numero troppo grande. Riprova.");
            }
            else if (numInserito < numDaIndovinare)
            {
                System.out.print("numero troppo piccolo. Riprova"); 
            }        
            
        }
        else
        {
            System.out.print("Hai indovinato!");
        }
       
        

    }

    
}
