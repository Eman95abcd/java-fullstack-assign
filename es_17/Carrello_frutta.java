 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello_frutta
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento 
        fruits.add("Banana");
        fruits.add("Arancia");
        // fruits.clear(); // il metodo per pulire 
        // fruits.remove(0); // il metodo per rimuovere un elemento specifico 
        // fruits.size();
        // fruits.isEmpty();
        
        

        for (String fruit : fruits)
        {
            System.out.println(fruit);
           //  System.out.println(fruits.size());
        }

        List<String> carrello = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        while (fruits.isEmpty()==false)
        {
            System.out.print("Scegli il prodotto da acquistare: ");
            String prodotto = input.next();
            fruits.remove(prodotto);
            carrello.add(prodotto);
            System.out.print("carrello: ");
            for (String prod : carrello)
            {
                System.out.print("\n"+ prod);
            }
            System.out.println("\nlista dei frutti: ");
            for (String frut : fruits)
            {
                System.out.print(frut + " \n");

            }
           

        }
       
    }
    
}

    

