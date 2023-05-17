import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Printlist2 {
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
         Scanner input = new Scanner(System.in);
         System.out.print("Quale elemento vuoi togliere? ");
         String elelist = input.nextLine();
         // int elelist = input.nextInt(); Rimuove un elemnento corrispondente all'indice digitato nell'input
         fruits.remove(elelist);
         System.out.print("Ora la lista e': " + fruits);
       
    }
    
}
