

public class forEach {
    public static void main(String[] args) 
    {
        int[] numbers = {1,2,3,4,5,6,7};
        for (int num : numbers)
        {
            int lunghezza = numbers.length; // la classe array ha un metodo che descrive la quantità totale degli elementi 
            System.out.println("numero " +num + " di "+lunghezza +" elementi" );
          
        }
    }
    
}
