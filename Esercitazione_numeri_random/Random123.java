import java.util.Random;


public class Random123 //ricordarsi di cambiare il nome della classe 
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int randomInt = rand.nextInt(100);
        System.out.println("Numero intero casuale: " + randomInt);

        double randomDouble = rand.nextDouble();
        System.out.println("Numero double casuale: " + randomDouble);

        boolean randomBoolean = rand.nextBoolean(); 
        System.out.println("Valore booleano casuale: " + randomBoolean);






    }
}