/*creare un programma che chieda all'utente di inserire la lunghezza del lato e restituisce in output
l'area ed il perimetro di un quadrato
utilizzando la variabile lato */
import java.util.Scanner;

public class calcolaPerimetroArea 


{
    public static void main(String[] args) //metodo main
    {
        Scanner input = new Scanner(System.in);  //creo un oggetto di classe Scanner di nome input che riceve input dall'utente
        System.out.print("Inserisci la lunghezza del lato: "); //stampa "Inserisci la lunghezza del lato: "
        double lato = input.nextDouble(); //creo una variabile di nome lato di tipo double che ha come valore il valore del metodo nextDouble dell'oggetto input
        double area = lato * lato; //creo una variabile area che ha come valore lato * lato
        double perimetro = lato * 4; //creo una variabile che ha come valore lato * 4
        int soglia = 400;
        if (lato > soglia || lato < 1)
        {
             System.out.print("il numero non e valido");
             
        }
        else
        {
            
            System.out.println("L'area del quadrato e: " + area); //stampa "L'area del quadrato e: " + area
            System.out.println("Il perimetro del quadrato e: " + perimetro); //stampa "il perimetro del quadrato e: " + perimetro
        }   
       
        
    }
    
}
