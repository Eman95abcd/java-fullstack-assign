 import java.util.ArrayList;
import java.util.List;

public class Printlist
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); // il metodo add della classe aggiunge un elemento 
        fruits.add("Banana");
        fruits.add("Arancia");
        fruits.clear();
        

        for (String fruit : fruits)
        {
            System.out.print(fruit);
        }

    }
    
}

    

