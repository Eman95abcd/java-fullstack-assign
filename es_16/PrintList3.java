import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrintList3 {
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento 
        fruits.add("Banana");
        fruits.add("Arancia");
        // fruits.clear(); // il metodo per pulire 
        // fruits.remove(0); // il metodo per rimuovere un elemento specifico 
        // fruits.size();
         // fruits.isEmpty();
         System.out.print("scrivi il frutto che vuoi inserire: ");
         fruits.add(input.nextLine());
         fruits.isEmpty();
        

        for (String fruit : fruits)
        {
            System.out.println(fruit);
           //  System.out.println(fruits.size());
        }
         System.out.print("Quale elemento vuoi togliere? ");


        
         // int elelist = input.nextInt(); Rimuove un elemnento corrispondente all'indice digitato nell'input
         fruits.remove(input.nextLine());
         for (String fruit : fruits)
         {
             System.out.println(fruit);


         }
        
         input.close();
       
    }
    
}