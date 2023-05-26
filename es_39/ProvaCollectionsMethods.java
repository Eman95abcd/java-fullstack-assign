import java.util.ArrayList;

public class ProvaCollectionsMethods 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");

        // Shuffle the list
        // Collections.shuffle(list);
        // Collections.sort(list);
        // Collections.reverse(list);
        // Collections.replaceAll(list,"Banana", "Mango");
        

        // Print the shuffled list
        System.out.println("Shuffled list: " + list);
    }
}